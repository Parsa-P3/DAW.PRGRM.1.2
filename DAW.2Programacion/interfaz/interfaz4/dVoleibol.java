package interfaz4;

public class dVoleibol extends balon{

 
    public dVoleibol(String entrenador, String liga, String nombreEquipo, int rankEquipo) {
            super(entrenador, liga, nombreEquipo, rankEquipo);
            //TODO Auto-generated constructor stub
        }

        public void ReglasVoleibol(){
        System.out.println("--- Reglas de Karate ---");
        System.out.println("Sistema de puntuación – Se juega al mejor de 5 sets, donde un equipo gana un set al llegar a 25 puntos con una ventaja de al menos 2 puntos.\n" + //
                        "\n" + //
                        "Toques permitidos – Cada equipo tiene un máximo de 3 toques antes de enviar el balón al otro lado (sin contar el bloqueo).\n" + //
                        "\n" + //
                        "Rotación de jugadores – Después de ganar el saque, los jugadores deben rotar en el sentido de las agujas del reloj.\n" + //
                        "\n" + //
                        "Red y contacto ilegal – No se puede tocar la red ni invadir el campo contrario al atacar o defender.");
        ReglasGenerales();
    }

        @Override
        public String toString() {
            return "Nombre de Equipo : " + nombreEquipo + " . Rankig : " + rankEquipo;
        }

        @Override
        public void metod1(deporteEquipo x) {
            System.out.println("Voleibol se juega con balon");
        }
    
   
}
