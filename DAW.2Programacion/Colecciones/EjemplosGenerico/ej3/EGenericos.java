package EjemplosGenerico.ej3;

import java.util.Arrays;

public class EGenericos {
     // Método genérico estático para concatenar dos arrays
    public static <T> T[] concatenarArrays(T[] array1, T[] array2) {
        // Creamos un nuevo array con espacio suficiente para ambos arrays
        T[] nuevoArray = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, nuevoArray, array1.length, array2.length);
        
        return nuevoArray;
    }

    public static void main(String[] args) {
    
        Integer[] numeros1 = {1, 2, 3};
        Integer[] numeros2 = {4, 5, 6};
        System.out.println("Antes de concatenar: " + Arrays.toString(numeros1) + " y " + Arrays.toString(numeros2));
        Integer[] concatenados = concatenarArrays(numeros1, numeros2);
        System.out.println("Después de concatenar: " + Arrays.toString(concatenados));

        System.out.println();

        Double[] decimales1 = {1.1, 2.2};
        Double[] decimales2 = {3.3, 4.4};
        System.out.println("Antes de concatenar: " + Arrays.toString(decimales1) + " y " + Arrays.toString(decimales2));
        Double[] concatenadosDoubles = concatenarArrays(decimales1, decimales2);
        System.out.println("Después de concatenar: " + Arrays.toString(concatenadosDoubles));
    
        
    }
}
