package biblioteca;

import java.util.Arrays;


public class biblioteca {
	
	private int cantidadLibros;
	private Libro[] libros;
	
	public biblioteca() {
		libros = new Libro[0];
		cantidadLibros = 0;
		
	}
	
	public void addLibro(Libro x) {
		// para no asignar arriba en cons un numero maximo con dejar 0 y abajo hacer un copy no hay limite mas
		libros = Arrays.copyOf(libros, cantidadLibros +1);
		libros[cantidadLibros] = x;
		cantidadLibros++ ;
	
	}
	
	public Libro[] getLibros() {
		return Arrays.copyOf(libros, cantidadLibros);
	}

}
