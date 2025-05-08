package EjemplosIterador;

import java.util.ArrayList;

public class Eiterador3 {
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
           for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) == 5) {
                nums.remove(i);
            }
            
        }
             for (Integer mostrar : nums) {
                System.out.print(" <> " + mostrar + " <> ");
            }


    }

}
/*
3. Implementar (sin utilizar un iterador) una aplicación donde se insertan 100 números
enteros aleatorios entre 1 y 10 (incluidos), que pueden estar repetidos, en una
colección. Después se eliminan todos los elementos que valen 5. Mostrar la
colección antes y después de la eliminación.
*/