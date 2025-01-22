package arrays;

import java.util.Arrays;
import java.util.Scanner;

//binary search icin guzel ornek
//arrays.sort ile duzenli hale getirdik once
//pdf de var!

public class array_11_not {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ciudades = {"MADRID" , "BARCELONA" , "SEVILLA" , "VALENCIA" , "MALAGA" };

        Arrays.sort(ciudades);
        String x = "";

        do {
            System.out.println("introducen el nombre de un ciudad en españa : ");
            x = scanner.nextLine().toUpperCase();

        int pos = Arrays.binarySearch(ciudades , x);
        if (pos >= 0){
            System.out.println("Ciudad encontrado");
        }else if(!("SALIR".equals(x) )) {
            System.out.println("Ciduad no encontrado");
        }else if ("SALIR".equals(x)){
            System.out.println("Saliendo de la programa");
        }
    }while(!(x.equals("SALIR")));
        
     
        
    }

}
