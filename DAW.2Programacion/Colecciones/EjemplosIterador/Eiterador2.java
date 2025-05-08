package EjemplosIterador;

import java.util.ArrayList;
import java.util.Scanner;

public class Eiterador2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programando 20 numeros aleatorios entre 1 y 10");
         ArrayList<Integer> nums = new ArrayList<>();
         ArrayList<Integer> unicos = new ArrayList<>();
            int contador = 0 ;
         
         
         while (contador < 20) {
          Integer random = (int)(Math.random() * 10) + 1; 
            nums.add(random);

            if (!unicos.contains(random)) {
               unicos.add(random);
            }
            contador ++;

         }
         System.out.println("Lista de 20 numeros aleatorios: ");
         for (Integer mostrar : nums) {
            System.out.println(mostrar);
         }

         System.out.println("Lista sin repeticion : ");
         for (Integer mostrar : unicos) {
            System.out.println(mostrar);
         }


    }

}

/*
2. Implementa (sin iteradores) una aplicación en la que se insertan 20 números enteros
aleatorios entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección. A
continuación, se crea una lista con los mismos elementos sin repeticiones.
 
*/