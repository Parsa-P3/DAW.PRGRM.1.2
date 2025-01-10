package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_7 {
//     7. Escribe un programa que solicite un número entero al usuario (n). A continuación,
// solicita al usuario que introduzca n números. El programa realiza la media de los
// números positivos, la media de los negativos, y cuenta el número de ceros
// introducido. 

    public class array_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("introduce un numero: ");
            int a = scanner.nextInt();
            
            double[] x = new double[a];

            int pozitivos = 0;
            int negativos = 0;
            int numnegativo = 0;
            int numpozitivo = 0;
            int zero = 0;
            double media = 0.0;
    
            for (int i = 0; i < x.length; i++) {
                System.out.println("introduce el numero " + (i+1) + " :" );
                double valor = scanner.nextDouble();
                x[i] = valor;
            }
            for (int i = 0; i < x.length; i++) {
                if(x[i]>0){
                    pozitivos ++;
                    numpozitivo = numpozitivo + (int) x[i];
                }else if (x[i]< 0){
                    negativos ++;
                    numnegativo = numnegativo + (int) x[i];
                }else{
                    zero ++;

                }
                
            }
            
            if(negativos == 0){
                System.out.println("media de los numeros negativos es : 0");
            }else{
                int medianegativos = numnegativo / negativos;
                System.out.println("media de los numeros negativos es : " + medianegativos);
            }
            int mediapozitivos = numpozitivo / pozitivos;  
            System.out.println("media de los numeros pozitivos es : " + mediapozitivos );
            System.out.println("Total de lo zeros :" + zero);
            System.out.println(Arrays.toString(x));
            

        }
    }
}