package interfaz4;

public class dNatacion extends deporteIndividual{
    
    
    
        public dNatacion(String entrenador, String liga) {
                super(entrenador, liga);
                //TODO Auto-generated constructor stub
            }
        
                public void ReglasNatacion(){
        System.out.println("--- Reglas de Karate ---");
        System.out.println("Salidas correctas – Los nadadores deben permanecer quietos en el bloque de salida hasta la señal. Un movimiento en falso puede llevar a descalificación.\n" + //
                        "\n" + //
                        "Técnica específica en cada estilo – En pruebas de braza, mariposa y espalda, los nadadores deben seguir la técnica adecuada; de lo contrario, pueden ser descalificados.\n" + //
                        "\n" + //
                        "Toques en los virajes – En braza y mariposa, es obligatorio tocar la pared con ambas manos al girar o terminar.\n" + //
                        "\n" + //
                        "No obstrucción – No se permite interferir con otro nadador ni bloquear su trayectoria en la piscina.");
        ReglasGenerales();
    }
}
