package arrays;

import java.util.Scanner;

// 4. Diseña un programa que solicite al usuario 5 números decimales. A continuación, se
// muestran los números en el mismo orden que se han introducido.


public class array_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] x = new double[5];

        for (int i = 0; i < x.length; i++) {
            System.out.println("introduce el numero " + (i+1) + " :" );
            double valor = scanner.nextDouble();
            x[i] = valor;
        }

        for (int y = 0; y < x.length; y++) {
            System.out.print(x[y] + " ");

        }
    }
}
