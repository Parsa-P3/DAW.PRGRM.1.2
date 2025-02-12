package pooAvanzada2;

import java.util.Scanner;

public class AppHoras {

	static public void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		 Hora r = new Hora(11, 30); //las 11:30
		 System.out.println(r);
		 for (int i = 1; i <= 61; i++) { //incrementamos 61 minutos,
		 r.inc();
		 }
		 System.out.println(r); // muestra la hora actualizada +61 minutos
		 System.out.println("Escriba una hora:");
		 int hora = new Scanner(System.in).nextInt();
		 boolean cambio = r.setHoras(hora); //cambia la hora

		 if (cambio) {System.out.println(r);}
		 else {System.out.println("La hora no se pudo cambiar");}
		 }
	

}
