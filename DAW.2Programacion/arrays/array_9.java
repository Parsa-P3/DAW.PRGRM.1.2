package arrays;

import java.util.Scanner;

public class array_9 {


    public static int buscar(int[] t, int clave) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                return i; 
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //arreglo no esta un traduccion correcta 
        System.out.print("Ingresa el tamaño del array: ");
        int tamano = scanner.nextInt();
        
        int[] array = new int[tamano];
        
      
        System.out.println("Ingresa los " + tamano + " elementos del array:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Ingresa el valor a buscar: ");
        int clave = scanner.nextInt();

        
        int resultado = buscar(array, clave);

        
        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }

        scanner.close();
    }
}
