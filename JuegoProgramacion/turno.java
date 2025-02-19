package TFP;

public class turno {
	protected boolean atacante;
	protected Personaje jugador1;
	protected Personaje jugador2;
	
	public turno(boolean atacante, Personaje jugador1, Personaje jugador2) {
		this.atacante = atacante;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	
	public void turnoQ(boolean atacante1 , Personaje jugador1 , Personaje jugador2) {
		System.out.println("Elige uno de los opciones: ");
		
		 System.out.println("Jugador 1 elige tu accion!");
         System.out.println("Pas (0)");
         if(atacante1) {
         	System.out.println("Atacar (1)");

         }else {
         	System.out.println("Atacar (1)");
         	System.out.println("Curar (2)");
         
         }
		
	}

}
