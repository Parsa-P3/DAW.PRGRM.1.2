package EjemplosIterador;

import java.util.ArrayList;
import java.util.Iterator;

public class Eiterador4 {
    public static void main(String[] args) {

        System.out.println("Programando 20 numeros aleatorios entre 1 y 10");
         ArrayList<Integer> nums = new ArrayList<>();

         

            int contador = 0 ;
            Integer random = 0;
         
         while (contador < 100) {
         random = (int)(Math.random() * 10) + 1; 
            nums.add(random);
            contador ++;
         }
         System.out.println("Lista de 100 numeros aleatorios: ");
         for (Integer mostrar : nums) {
            System.out.print(" <> " + mostrar + " <> ");
         }
         System.out.println("----------------------");
         System.out.println("----------------------");

         System.out.println("Misma lista sin numero 5: ");

         Iterator<Integer> iterator = nums.iterator();

         while (iterator.hasNext()) {
            int x = iterator.next();
            if (x == 5) {
                iterator.remove();
                
            }
         } 
         
             for (Integer mostrar : nums) {
                System.out.print(" <> " + mostrar + " <> ");
            }


    }

}
/*
4. Implementa el mismo código que el ejercicio 3 utilizando un iterador para eliminar los
elementos con valor = 5.
 */