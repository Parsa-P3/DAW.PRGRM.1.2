package biblioteca;

import java.util.Scanner;

public class AppBiblioteca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la cantidad de libros que quieres ver su informacion: ");
		int z = scanner.nextInt();
		
		Libro l1 = new Libro("X" ,"Dostoyevski", 1970);
		Libro l2 = new Libro("Y", "Kafka", 1990);

		biblioteca b1 = new biblioteca();
		
	
		b1.addLibro(l1);
		b1.addLibro(l2);
		
		
		
		// si numero de consulta es menor de lo que tenemos!
		if(z < b1.getLibros().length) {
			System.out.println("Lista de los libros : ");
			for(int i = 0 ; i < z ; i++) {
				Libro ll[] = b1.getLibros();
				System.out.println( ll[i]);
			}
		}
		// si el numero de consulta es mayor de lo que tenemos!
		else if(z > b1.getLibros().length){
			System.out.println("No hay tantas libros");
			System.out.println("Solo hay " + b1.getLibros().length + " unidades");
		}
		// si el numero de consulta es igual a lo que tenemos!
		else {
			System.out.println("Lista de los libros : ");
			for (Libro x : b1.getLibros() ) {
				
				System.out.println("El libro : " + x.getTitulo() + " , fue escrito por  " + x.getAutor() +  " en el año " + x.getAnyo());
				
			}
		}
		
	
		
	}

}
