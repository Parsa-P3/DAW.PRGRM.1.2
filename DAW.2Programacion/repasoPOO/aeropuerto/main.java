package aeropuerto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        vuelos v1 = new vuelos("123E", "Istanbul", "Madrid", 230, 20);
        v1.info();

        pasajeros p1 = new pasajeros("Parsa", 999);
        p1.info();

        if (v1.confirmar()) {
            System.out.println("Quereis hacer reservasion : ");
            String rez = scanner.nextLine().toLowerCase();
            if("si".equals(rez)){
                System.out.println("Cuantos asientos ? ");
                int asiento = scanner.nextInt();
                if(asiento > v1.getAsientosDisponibles()){
                    System.out.println("No se puede realizar la reservasion , solo existen " + v1.getAsientosDisponibles() + " Asientos disponibles ");
                }else{
                    reservas r1 = new reservas(asiento, p1, v1);
                    r1.info();
                    v1.setAsientosDisponibles(asiento);
                    v1.info();
                }
           
            
            }else{
                System.out.println("Cerrando programa...");
            }
        }else{
            System.out.println("en el vuelo " + v1.getCodigoVuelo() + " No hay asientos disponibles!");
        }

    }

}
