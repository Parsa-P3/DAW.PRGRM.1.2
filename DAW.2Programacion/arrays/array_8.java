package arrays;

// hemos puesto un * despues de ordenarlos abajo en linea 35
import java.util.*;

public class array_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor introducen el longitud!");
        int longitud = scanner.nextInt();
        System.out.println("Porfavor introducen el fin!");
        int fin = scanner.nextInt();
        rellenaPares(longitud, fin);
        int[] solucion = rellenaPares(longitud, fin);
        for (int i = 0; i < solucion.length ; i++) {
            System.out.print(solucion[i] + " ");
            
        }
        
    }

    static int[] rellenaPares(int longitud , int fin){
        int[] x = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            int randompar =(int) (Math.random() * 100);
            while (!(randompar % 2 == 0) || (randompar > fin)) { 
                randompar = (int) (Math.random() * 100);
                x[i] = randompar;
                
            }

        }
        // es para ordenar de menor a mayor
        Arrays.sort(x);
        return x; 
    }
    
}
