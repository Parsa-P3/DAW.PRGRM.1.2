package arrays;

import java.util.Scanner;
// 6. Diseña un programa que solicite al usuario 4 números enteros. A continuación, se
// muestran el máximo de los números introducidos.
// Utiliza una función que reciba como parámetro el array que contiene los 4 números y
// devuelva un entero, correspondiente al valor máximo almacenado en el array.



public class array_6 {
    //4 sayi arasindan en buyugunu bulmak icin yaptigimiz for metodu , max = 0 yaparsak eksi sayilarda hata veriyor!
    //bu yuzden bir baslama degeri olmali!

    static int max(int[] array1){
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if(max< array1[i]){
                max = array1[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[4];

        for (int i = 0; i < x.length; i++) {
            System.out.println("introduce el numero " + (i+1) + " :" );
            int valor = scanner.nextInt();
            x[i] = valor;
        }
        
        System.out.println(max(x));



      
    }
}