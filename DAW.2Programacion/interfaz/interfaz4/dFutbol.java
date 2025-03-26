package interfaz.interfaz4;

public class dFutbol extends deporteEquipo{
    
    
    
        public dFutbol(String entrenador, String liga, String nombreEquipo, int rankEquipo) {
                super(entrenador, liga, nombreEquipo, rankEquipo);
                //TODO Auto-generated constructor stub
            }
        
                public void ReglasFutbol(){
        System.out.println("--- Reglas de Karate ---");
        System.out.println("Duración del partido – Un partido consta de dos tiempos de 45 minutos cada uno, con un descanso de 15 minutos.\n" + //
                        "\n" + //
                        "Regla del fuera de juego – Un jugador está en fuera de juego si recibe un pase estando más cerca de la portería rival que el último defensor, salvo que esté en su propio campo.\n" + //
                        "\n" + //
                        "Faltas y tarjetas – Las infracciones pueden sancionarse con tiro libre, penalti, tarjeta amarilla (advertencia) o tarjeta roja (expulsión).\n" + //
                        "\n" + //
                        "Balón en juego o fuera de juego – El balón solo se considera fuera de juego cuando ha cruzado completamente las líneas de banda o gol.");
        ReglasGenerales();
    }
}
