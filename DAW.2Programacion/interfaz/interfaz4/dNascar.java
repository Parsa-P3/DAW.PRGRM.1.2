package interfaz4;

public class dNascar extends deporteIndividual{
    
    
        public dNascar(String entrenador, String liga) {
                super(entrenador, liga);
                //TODO Auto-generated constructor stub
            }
        
                public void ReglasNascar (){
        System.out.println("--- Reglas de Taekwondo ---");
        System.out.println("Bandera amarilla y seguridad – Si hay un accidente o peligro en pista, se activa la bandera amarilla y los pilotos deben reducir la velocidad sin adelantar.\n" + //
                        "\n" + //
                        "Zona de boxes – Se debe respetar el límite de velocidad en boxes; una infracción puede causar una penalización.\n" + //
                        "\n" + //
                        "Contacto permitido pero con límites – Aunque hay cierto contacto entre autos, maniobras intencionales para chocar o sacar a un rival de la pista pueden resultar en sanciones.\n" + //
                        "\n" + //
                        "Final bajo bandera verde – Si hay una bandera amarilla en las últimas vueltas, se puede extender la carrera con un “Green-White-Checkered” para asegurar un final limpio.");
        ReglasGenerales();
    }
}
