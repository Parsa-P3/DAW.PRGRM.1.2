package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longitud = 5;
        int[] a =  new int[longitud];
        a = rellenaDuplicados(a, longitud);

        System.out.println(Arrays.toString(a));
        

    }

    static int[] rellenaDuplicados(int a[] , int longitud) {
        a = new int[longitud];
        boolean dup = false;
        a[0] = 3;
        for (int z = 0; z < a.length; z++) {
            
            int random = 3; 

            for (int i = 0; i < z;) {
                if (!(a[i] == random)) {
                    dup = true;
                    random++;
                    i++;
                }
                
            }

            
            if (dup) {
                a[z] = random;
                
            } 
          
            
        }
        return a;
        
    }
}