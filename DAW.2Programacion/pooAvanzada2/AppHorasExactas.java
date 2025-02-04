package pooAvanzada2;

import java.util.Scanner;

public class AppHorasExactas {
	static public void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		HorasExacta r = new HorasExacta (11, 15, 23); //¡hora del descanso!
		System.out.println(r);
		for (int i = 1; i <= 61; i++) {
		r.incseg();
		}
		System.out.println(r); // hora inicial +61 segundos
		System.out.println("Escriba los segundos: ");
		int segundos = new Scanner(System.in).nextInt();
		if (r.setsegundos (segundos)) {
		System.out.println(r);
		} else{
		System.out.println("No es posible cambiar los segundos");
		}
		

		HorasExacta a = new HorasExacta(1, 2, 3);
		HorasExacta b = new HorasExacta(1, 2, 3);
		HorasExacta c = new HorasExacta(10, 20, 30);
		
		System.out.println(a.equals(b)); // son iguales
		System.out.println(a.equals(c)); // son distintas
		
}
	

}
