package arrays;

// hemos puesto un * despues de ordenarlos abajo en linea 35
import java.util.*;

// 8. Escribe un programa que utilice una función con el siguiente prototipo
// int[ ] rellenaPares(int longitud, int fin)
// La función rellenaPares crea y devuelve un array ordenado de la longitud
// especificada, cuyos elementos son números pares aleatorios comprendidos en el
// rango desde 2 hasta fin (inclusive).

// 13. Realiza los cambios necesarios en el programa implementado en el ejercicio 8, para
// no introducir valores duplicados en el array final.
public class array_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor introducen el longitud!");
        int longitud = scanner.nextInt();
        System.out.println("Porfavor introducen el fin!");
        int fin = scanner.nextInt();

        int[] solucion = rellenaPares(longitud, fin);

        for (int i = 0; i < solucion.length; i++) {
            System.out.print(solucion[i] + " ");

        }

    }

    static int[] rellenaPares(int longitud, int fin) {
        int[] x = new int[longitud];

        // no ponemos z++ en el for porqq queremos que incrementa solo 
        // en un condicion que no sea duplicado
        for (int z = 0; z < longitud; ) {

            int randompar = (int) (Math.random() * fin) + 1;           

            boolean duplicado = false;

         for (int i = 0; i < z; i++) {
                if (x[i] == randompar) {
                    duplicado = true;
                    break;
                }
            }

            //el condicion que va incrementando el for principal
            if (!duplicado && (randompar % 2 == 0)) {
                x[z] = randompar;
                z++; 
            }

        }
      
        Arrays.sort(x);
        return x;
    }
}
