package interfaz.interfaz4;

public class dKarate extends deporteIndividual{
    
   
    
        public dKarate(String entrenador, String liga) {
                super(entrenador, liga);
                //TODO Auto-generated constructor stub
            }
        
                public void ReglasKarate(){
        System.out.println("--- Reglas de Karate ---");
        System.out.println("Respeto y etiqueta – Los competidores deben saludar (rei) antes y después del combate o kata, mostrando respeto hacia su oponente, los jueces y el árbitro.\n" + //
                        "\n" + //
                        "Zona de combate delimitada – En kumite, los competidores deben mantenerse dentro del área establecida; salir repetidamente del tatami puede llevar a penalizaciones.\n" + //
                        "\n" + //
                        "Sistema de puntuación – Se otorgan puntos según la efectividad y precisión de los golpes:\n" + //
                        "\n" + //
                        "Ippon (3 puntos): Patada a la cabeza o técnica con derribo seguido de golpe válido.\n" + //
                        "\n" + //
                        "Waza-ari (2 puntos): Patada al torso.\n" + //
                        "\n" + //
                        "Yuko (1 punto): Golpe de puño al torso o cabeza.\n" + //
                        "\n" + //
                        "Penalizaciones por faltas – Se sanciona el contacto excesivo, golpes a zonas prohibidas, falta de combatividad o conducta antideportiva, lo que puede llevar a advertencias, pérdida de puntos o descalificación.");
        ReglasGenerales();
    }
}
