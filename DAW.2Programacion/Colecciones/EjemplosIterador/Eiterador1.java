package EjemplosIterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Eiterador1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor introducen numero enteros positivos!");
        System.out.println("Introducir -1 para salir del programa");
         ArrayList<Integer> nums = new ArrayList<>();

         Integer bir = scanner.nextInt();
         
         while (bir != -1) {
            if (bir<0) {
                System.out.println("No puede ser negativo!!");
            }else{
             nums.add(bir);
            
            }
            bir = scanner.nextInt();  
         }
         System.out.println("-----------");
         System.out.println("Numeros de la lista : ");
         for (Integer integer : nums) {
            System.out.println(integer);
         }
         System.out.println("-----------");
         System.out.println("Numeros pares:");
         int contadorpar = 0;
         for (Integer integer : nums) {
            if (integer % 2 == 0) {
                System.out.println(integer);
                contadorpar += 1;
            }
         }
         if (contadorpar < 1) {
            System.out.println("No se encontrado numeros pares!");
            System.out.println("-----------");
         }
         System.out.println("-------------");

         Iterator<Integer> iterator = nums.iterator();

         while (iterator.hasNext()) {
            int y = iterator.next();
            if (y % 3 == 0) {
                iterator.remove();
                System.out.println("Numero eliminado : " + y);
            }
         }

         System.out.println("--------------");
         System.out.println("Lista final : ");
         for (Integer integer : nums) {
            System.out.println(integer);
         }

    }
}

/*
1. Implementa, utilizando un iterador una aplicación que pida por consola números
enteros no negativos hasta que se introduce −1.
Los números se irán insertando en una colección, pudiéndose repetir.
Al terminar la entrada de datos, se mostrará la colección por pantalla.
A continuación, se mostrarán todos los valores pares.
Por último, se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la
colección resultante.
 */