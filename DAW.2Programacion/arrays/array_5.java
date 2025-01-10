package arrays;

import java.util.Scanner;

// 5. Diseña un programa que pregunte al usuario cuántos números enteros quiere
// introducir. A continuación, se solicita esa cantidad de números enteros y por último
// se imprimen en orden inverso al introducido.


public class array_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numero quieres introducir? ");
        int a = scanner.nextInt();
        
        double[] x = new double[a];

        for (int i = 0; i < x.length; i++) {
            System.out.println("introduce el numero " + (i+1) + " :" );
            double valor = scanner.nextDouble();
            x[i] = valor;
        }

        for (int y = x.length - 1; y >= 0; y--) {
            System.out.print(x[y] + " ");

        }
    

    }
}
