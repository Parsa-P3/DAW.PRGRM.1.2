package interfaz.interfaz4;

public class dTakeWondo extends deporteIndividual{
    
    public dTakeWondo(String nombreEquipo, String rankEquipo) {
            super(nombreEquipo, rankEquipo);
            //TODO Auto-generated constructor stub
        }
    
        public void ReglasTakewondo(){
        System.out.println("--- Reglas de Taekwondo ---");
        System.out.println("Uso obligatorio de equipo de protección – Los competidores deben llevar casco, peto, protector bucal, guantes, espinilleras y otros elementos de seguridad para evitar lesiones.\n" + //
                        "\n" + //
                        "Sistema de puntuación – Se otorgan puntos según la técnica utilizada y la zona de impacto:\n" + //
                        "\n" + //
                        "1 punto: Golpe de puño al peto.\n" + //
                        "\n" + //
                        "2 puntos: Patada al peto.\n" + //
                        "\n" + //
                        "3 puntos: Patada a la cabeza.\n" + //
                        "\n" + //
                        "4 o más puntos: Patadas con giro (dependiendo de la técnica).\n" + //
                        "\n" + //
                        "Duración del combate – Un combate estándar se compone de 3 rounds de 2 minutos cada uno, con un descanso de 1 minuto entre rounds.\n" + //
                        "\n" + //
                        "Faltas y penalizaciones – Acciones como golpes ilegales (bajo la cintura, a la espalda o nuca), salir del área, evitar el combate o conducta antideportiva pueden llevar a advertencias, pérdida de puntos o descalificación.");
        ReglasGenerales();
    }
}
