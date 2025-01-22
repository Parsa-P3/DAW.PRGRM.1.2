import java.util.*;

public class ArraySinDuplicados {

    public static void main(String[] args) {
        // Ejemplo de arreglo con duplicados
        int[] arrayConDuplicados = {1, 2, 3, 2, 4, 5, 3, 6, 4};
        
        // Llamamos a la función para eliminar los duplicados
        int[] arraySinDuplicados = eliminarDuplicados(arrayConDuplicados);

        // Imprimir el array sin duplicados
        System.out.println("Array sin duplicados: " + Arrays.toString(arraySinDuplicados));
    }

    // Función para eliminar duplicados
    static int[] eliminarDuplicados(int[] array) {
        // Crear una lista temporal para almacenar los valores únicos
        int[] tempArray = new int[array.length]; // Array temporal con el mismo tamaño
        int tempIndex = 0; // Índice para insertar en el array temporal
        
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            
            // Comprobamos si el elemento ya existe en el array temporal
            for (int j = 0; j < tempIndex; j++) {
                if (tempArray[j] == array[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // Si no es duplicado, lo copiamos al array temporal
            if (!isDuplicate) {
                tempArray[tempIndex] = array[i];
                tempIndex++;
            }
        }

        // Usamos arraycopy para crear un nuevo array del tamaño adecuado
        int[] resultArray = new int[tempIndex];
        System.arraycopy(tempArray, 0, resultArray, 0, tempIndex);
        
        return resultArray;
    }
}
