package interfaz4;

import java.util.Scanner;

public class AppDeporte {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] estadios = {"Estambul", "Ankara", "Madrid", "Berlin"};


        System.out.println(" * Bienvenido al sistema de organizacion de eventos deportivos *");
        System.out.println(" * Porfavor elegir uno de los opciones : *");
        System.out.println("- Deporte Equipo (1)");
        System.out.println("- Deporte Individual (2)");
        int tipo = scanner.nextInt();
        if (tipo == 1) {
                    
                
                System.out.println(" * A cual de los deportes quereis añadir evento :");
                System.out.println(" * Voleibol (1)");
                System.out.println(" * Futbol   (2)");
                int ElegirDeporte = scanner.nextInt();

                dVoleibol[] equiposVoleibol = {
                    new dVoleibol("Pedro", "Ziraat lig", "Besiktas", 84),
                    new dVoleibol("Marco", "Ziraat lig", "Fenerbahce", 81),
                    new dVoleibol("Alex", "La Liga", "Real Madrid", 88),
                    new dVoleibol("Muller", "La liga", "Bayern Munich", 87)
                };

                dFutbol[] equiposFutbol = {
                    new dFutbol("Ronaldo", "Premier League", "Manchester United", 92),
                    new dFutbol("Messi", "Ligue 1", "PSG", 94),
                    new dFutbol("Neymar", "Ligue 1", "Barcelona", 89),
                    new dFutbol("Benzema", "La Liga", "Real Madrid", 90)
                };

                deporteEquipo[] equipo_selecionado = null ;

                //HEMOS DEJADO AQUI ! 27/03/2025
                equiposVoleibol[0].ReglasVoleibol();

                if (ElegirDeporte == 1){
                    equipo_selecionado = equiposVoleibol ;
                }else if(ElegirDeporte == 2){
                    equipo_selecionado = equiposFutbol ;
                }else{
                    System.out.println("Opcion invalido!");
                }

                System.out.println(" * Lista de equipos ");
                for (int i = 0; i < equipo_selecionado.length; i++) {
                    System.out.println((i + 1) + " -- " + equipo_selecionado[i].toString());
                }

                System.out.println(" Elegir primer equipo : ");
                int eq1 = scanner.nextInt()  - 1;
                System.out.println(" Elegir el segundo equipo : ");
                int eq2 = scanner.nextInt() - 1;

                if (eq1 == eq2 || eq1 < 0 || eq2 < 0 || eq1 >= equipo_selecionado.length || eq2 >= equipo_selecionado.length) {
                    System.out.println("ERROR! Equipos no válidos.");
                    return;
                }

                System.out.println("Elegir el estadio: ");
                for (int i = 0; i < estadios.length; i++) {
                    System.out.println((i + 1) + " - " + estadios[i]);
                }

                int stad = scanner.nextInt() - 1;
                if (stad < 0 || stad >= estadios.length) {
                    System.out.println("ERROR! Estadio no válido.");
                    return;
                }

                equipo_selecionado[eq1].competicionDeporteEquipo(equipo_selecionado[eq1], equipo_selecionado[eq2], estadios[stad]);
                
    }else if(tipo == 2){

    }
    }
}
