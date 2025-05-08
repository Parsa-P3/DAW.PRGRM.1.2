package EjemplosGenerico.ej2;
    import java.util.Arrays;

public class EGenericos {

    // Método genérico estático para insertar un elemento al final de un array
    public static <T> T[] insertarAlFinal(T[] array, T elemento) {
        // Usamos Arrays.copyOf para crear un nuevo array con espacio adicional
        T[] nuevoArray = Arrays.copyOf(array, array.length + 1);
        nuevoArray[array.length] = elemento;  // Añadimos el nuevo elemento al final
        return nuevoArray;
    }

    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3};
        System.out.println("Antes de insertar: " + Arrays.toString(numeros));
        numeros = insertarAlFinal(numeros, 4);
        System.out.println("Despues de insertar: " + Arrays.toString(numeros));

        System.out.println();

        Double[] decimales = {1.1, 2.2, 3.3};
        System.out.println("Antes de insertar: " + Arrays.toString(decimales));
        decimales = insertarAlFinal(decimales, 4.4);
        System.out.println("Despues de insertar: " + Arrays.toString(decimales));
    }
}


