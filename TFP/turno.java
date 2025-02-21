package TFP;

public class turno {
	Map mapa;
	Region region;
	Personaje personaje;
	protected Personaje jugador1;
	protected Personaje jugador2;
	
	public turno(Personaje jugador1, Personaje jugador2) {

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
	
	public void EligeRegion(String x ){

        System.out.println("* * * * * * * * * * * * * * * * * * * *");
        System.out.println("Elige Region para heroe de  " + x + " :");
        System.out.println("");
        System.out.println("º 🥷 🥷 🥷 🥷 🥷 🥷 🥷  🥷 🥷 🥷 🥷 🥷 🥷 🥷 º");
        System.out.println("|1 - Ionia (HP +100, DAMAGE +50, ARMOR +25) |");
        System.out.println("|2 - Noxus (HP +50, DAMAGE +100, ARMOR +25) |");
        System.out.println("|___________________________________________|");
        
		
    }
	
	public void EligeHeroe(int RegionElegido) {
		  System.out.println("º---------------------------º");
          System.out.println(" --------------------------- ");
          System.out.println(" --------------------------- ");
          System.out.println(" --------------------------- ");
          System.out.println(" --------------------------- ");
          System.out.println(" --------------------------- ");
          System.out.println(" --------------------------- ");
          System.out.println(" --------------------------- ");
          System.out.println(" --------------------------- ");
    if(RegionElegido == 1) {
          System.out.println("ºElige el tipo de heroe :");
          System.out.println();
          System.out.println("⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️");
          System.out.println("1 - Yasuo (25 HP - 10 DAMAGE - 2 ARMOR)");
          System.out.println("");
          System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹");
          System.out.println("2 - Lux (40 HP - 2 DAMAGE - 10 ARMOR)");

	}else if (RegionElegido == 2) {
        System.out.println("ºElige el tipo de heroe :");
        System.out.println("");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("1 - Katarina (25 HP - 10 DAMAGE - 2 ARMOR)");
        System.out.println("");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("2 - Darius (40 HP - 2 DAMAGE - 10 ARMOR)");
	}
	}
	
	public void EligeMap(Personaje Personaje) {
		  System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
          System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
          System.out.println("⛓️⛓️ Aqui puedes elegir en que posicion colocar tu heroe ?!⛓️⛓️⛓");
          System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
          
          System.out.println("º___________________________________º");
          System.out.println("|         |               |         |");
          System.out.println("|    1    |       2       |    3    |");
          System.out.println("|_________|_______________|_________|");
          System.out.println("|         |               |         |");
          System.out.println("|    4    |       5       |    6    |");
          System.out.println("|_________|_______________|_________|");
          System.out.println("|         |               |         |");
          System.out.println("|    7    |       8       |    9    |");
          System.out.println("|_________|_______________|_________|");
	}
	
	public void spam() {
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
	}
	
	public void atack(String nombreJugadorAt , Personaje atacante , Personaje RecibirAtace , int dondeatacar , int mapa2 , Map mapa) {

		if(dondeatacar == mapa2) {
			atacante.atacar();
				
				int anteAtaque = RecibirAtace.getVida();
			RecibirAtace.defender(atacante.ataque);
			int vidaActual = RecibirAtace.getVida();
		
			mapa.placePlayer(anteAtaque,vidaActual);
	           System.out.println("Daño realizado a " + nombreJugadorAt + " :");
	           System.out.println("---> " + ( RecibirAtace.defensa - atacante.ataque));
	           System.out.println("Daño bloqueado : ");
	           System.out.println("---> " + ( RecibirAtace.defensa ));
	           System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
	           System.out.println("🏹 🧙   FIN DEL TURNO PARA "+ nombreJugadorAt+"! 🏹 🧙");
	           System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
		}
	}

	public void posiblesAtaces(String p1 , String p2 , String p3 , String p4) {
		System.out.println("A " + p1 + " (1)");
		System.out.println("A " + p2 + " (2)");
		System.out.println("A " + p3 + " (3)");
		System.out.println("A " + p4 + " (4");
	}
	
}
