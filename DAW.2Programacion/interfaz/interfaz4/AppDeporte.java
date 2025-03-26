package interfaz.interfaz4;

import java.util.Scanner;

public class AppDeporte {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        dVoleibol equipoVoleybol1 = new dVoleibol("Pedro", "Ziraat lig", "Besiktas", 84);
        dVoleibol equipoVoleybol2 = new dVoleibol("Marco", "Ziraat lig", "Fenerbahce", 81);
        dVoleibol equipoVoleybol3 = new dVoleibol("Alex", "La Liga", "Real Madrid", 88);
        dVoleibol equipoVoleybol4 = new dVoleibol("Muller", "La liga", "Bayern Munich", 87);

        

        String stad1 = "Estambul" ;
        String stad2 = "Ankara" ;
        String stad3 = "Madrid" ;
        String stad4 = "Berlin" ;

        System.out.println(" * Bienvenido al sistema de organizacion de eventos deportivos *");
        System.out.println(" * A cual de los deportes quereis añadir evento :");
        System.out.println(" * Voleibol (1)");
        System.out.println(" * Futbol   (2)");
        System.out.println(" * ");
        System.out.println(" * ");
        System.out.println(" * ");
        System.out.println(" * ");
        System.out.println(" * ");
        int ElegirDeporte = scanner.nextInt();

        if(ElegirDeporte == 1){
            System.out.println(" * Lista de equipos ");
            System.out.println(" -- " + equipoVoleybol1.toString());
            System.out.println(" -- " + equipoVoleybol2.toString());
            System.out.println(" -- " + equipoVoleybol3.toString());
            System.out.println(" -- " + equipoVoleybol4.toString());


            System.out.println(" Elegir primer equipo : ");
            int eq1 = scanner.nextInt();
            dVoleibol Voley1 = null;
            if(eq1 == 1){
                Voley1 = equipoVoleybol1 ;
            }else if (eq1 == 2){
                Voley1 = equipoVoleybol2 ;
            }else if (eq1 == 3){
                Voley1 = equipoVoleybol3 ;
            }else if (eq1 == 4){
                Voley1 = equipoVoleybol4 ;
            }

            System.out.println(" Elegir el segundo equipo : ");
            int eq2 = scanner.nextInt();
            dVoleibol Voley2 = null;
            if(eq1 == eq2){
                System.out.println("ERROR!");
            }else if(eq2 == 1){
                Voley2 = equipoVoleybol1 ;
            }else if (eq2 == 2){
                Voley2 = equipoVoleybol2 ;
            }else if (eq2 == 3){
                Voley2 = equipoVoleybol3 ;
            }else if (eq2 == 4){
                Voley2 = equipoVoleybol4 ;
            }

            System.out.println("Elegir el stadyum : ");
            System.out.println(stad1 +" (1)");
            System.out.println(stad2 +" (2)");
            System.out.println(stad3 +" (3)");
            System.out.println(stad4 +" (4)");

            int stad = scanner.nextInt();
            String stadyum = "";
            if(stad == 1){
                stadyum = stad1 ;
            }else if (stad == 2){
                stadyum = stad2 ;
            }else if (stad == 3){
                stadyum = stad3 ;
            }else if (stad == 4){
                stadyum = stad4 ;
            }

            equipoVoleybol1.competicionDeporteEquipo(Voley1, Voley2, stadyum);
        }
    }
}
