package interfaz.interfaz4;

public class dFormula1 extends deporteIndividual{
    
   
    
        public dFormula1(String entrenador, String liga) {
                super(entrenador, liga);
                //TODO Auto-generated constructor stub
            }
        
                public void ReglasFormula1(){
        System.out.println("--- Reglas de Taekwondo ---");
        System.out.println("Salida controlada – Los pilotos deben respetar las luces de salida; un movimiento antes de que se apaguen las luces puede resultar en una penalización.\n" + //
                        "\n" + //
                        "Límites de pista – No se permite sobrepasar los límites del circuito repetidamente para ganar ventaja.\n" + //
                        "\n" + //
                        "Uso de neumáticos y paradas en boxes – Se debe utilizar al menos dos compuestos de neumáticos diferentes en una carrera (en condiciones secas).\n" + //
                        "\n" + //
                        "Defensa justa – Un piloto solo puede cambiar de dirección una vez para defender su posición; maniobras peligrosas pueden ser penalizadas.");
        ReglasGenerales();
    }
}
