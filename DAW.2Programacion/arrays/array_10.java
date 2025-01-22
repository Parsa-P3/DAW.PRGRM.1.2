package arrays;

import java.util.Scanner;

public class array_10 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] meses = {"Enero" , "Febrero" , "Marzo" , "Abril" , "Mayo" , "Junio" , "Julio" , "Agosto" , "Septiembre" , "Octubre" , "Noviembre" , "Diciembre"};
        int[] dias = {31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};

        System.out.println("porfavor introducir el nombre de mes que quereis consultar: ");
        String x = scanner.nextLine().toUpperCase();
       
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].toUpperCase().equals(x)) {
                System.out.println("El mes de " + meses[i] + " tiene " + dias[i] + " dias.");
                
                
            }
        }
       


    }
}
