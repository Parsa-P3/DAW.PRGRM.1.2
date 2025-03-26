package interfaz.interfaz3;

import java.util.Scanner;

public class appV {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        Coche c1 = new Coche("VolksWagen", "Golf 1.2", 2016 );
        CocheElectrico c2 = new CocheElectrico("Tesla", "Adventure", 2020, 100);
        System.out.println("Modo deportivo ? ");
        String mod = scanner.nextLine();
        boolean deportivo = true ;
        if("si".equalsIgnoreCase(mod)){
            deportivo = true ;
        }else {
            deportivo = false ;
        }
        System.out.println(c1.toString());
        c1.acelerar(deportivo);
        System.out.println("***");
        c1.acelerar(deportivo);
        System.out.println("***");
        c1.acelerar(deportivo);
        System.out.println("***");
        c1.acelerar(deportivo);
        System.out.println("***");
        c1.acelerar(deportivo);
        System.out.println("***");
        c1.frenar();
    
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");

        System.out.println(c2.toString());
        c2.acelerar();
        System.out.println("***");
        c2.acelerar();

        c2.cargarBateria();
        
        

    }
}
