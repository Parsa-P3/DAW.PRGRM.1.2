package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ciudades = { "BARCELONA", "MADRID", "MALAGA", "SEVILLA", "VALENCIA", "VALENCIA" };

        Arrays.sort(ciudades);
        String x = "";

        do {
            System.out.println("introducen el nombre de un ciudad en españa : ");
            x = scanner.nextLine().toUpperCase();

            int pos = Arrays.binarySearch(ciudades, x);
            if (pos >= 0) {
                System.out.println("Ciudad encontrado");
                int count = 0;
                for (int i = 0; i < ciudades.length; i++) {
                    if (x.equals(ciudades[i])) {
                        count++;
                    }
                    if (count == 1){
                        int firstt = i;
                        System.out.println("Primer posicion : " + firstt);
                        System.out.println("-----");
                    }
                }
                System.out.println("La ciudad '" + x + "' aparece " + count + " veces.");

        
                for (int i = ciudades.length - 1; i < ciudades.length; i--) {

                    if (x.equals(ciudades[i])) {
                        int last = i;
                        System.out.println("Ultimo posicion : " + last);
                        System.out.println("-----");
                        break;

                    }

                }
            } else if (!("SALIR".equals(x))) {
                System.out.println("Ciduad no encontrado");
            } else if ("SALIR".equals(x)) {
                System.out.println("Saliendo de la programa");
            }
        } while (!(x.equals("SALIR")));

    }

}
