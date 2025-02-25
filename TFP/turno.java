package TFP;
//clase utilizando para evitar codigos y textos duplicados y manejar bien el orden del turno
public class turno {
	Map mapa;
	Region region;
	Personaje personaje;
	protected Personaje jugador1;
	protected Personaje jugador2;
	
	// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
	//cons de turno
	public turno(Personaje jugador1, Personaje jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	
	
	//menu opciones de juego 
	public void turnoQ(String  z ) {
		System.out.println("Elige uno de los opciones " + z +" :");
		
         	System.out.println("Atacar (1)");
         	System.out.println("Curar (2)");
         	System.out.println("Usa pocion de efecto(3)");
         
         
		
	}
	
	//metodo para mostrar regiones
	public void EligeRegion(String x ){
	     System.out.println("");
	        System.out.println("");
		System.out.println("  ____            _                 \r\n"
				+ " |  _ \\ ___  __ _(_) ___  _ __  ___ \r\n"
				+ " | |_) / _ \\/ _` | |/ _ \\| '_ \\/ __|\r\n"
				+ " |  _ <  __/ (_| | | (_) | | | \\__ \\\r\n"
				+ " |_| \\_\\___|\\__, |_|\\___/|_| |_|___/\r\n"
				+ "            |___/                   ");
		System.out.println("___________________________________________");
        
        System.out.println("Elige Region para heroe de  " + x + " :");
        System.out.println("");
        System.out.println("º 🥷 🥷 🥷 🥷 🥷 🥷 🥷  🥷 🥷 🥷 🥷 🥷 🥷 🥷 º");
        System.out.println("1 - Ionia (HP +100, DAMAGE +50, ARMOR +25) ");
        System.out.println("2 - Noxus (HP +50, DAMAGE +100, ARMOR +25) ");
        System.out.println("___________________________________________");
        
		
    }
	// mostrar confirmacion de heroes
	public void mostrarHeroes(Personaje a ,Personaje b ,Personaje c ,Personaje d , String aa ,  String bb,  String cc,  String dd ) {
		  System.out.println("");
		  System.out.println("___________________________________________");
	      System.out.println(a.toString()+  ". (para " + aa +")");
	      System.out.println(b.toString()+ ".  (para " + bb +")");
	      System.out.println(c.toString()+ ".  (para " + cc +")");
	      System.out.println(d.toString()+ ".  (para " + dd +")");
	      System.out.println("___________________________________________");
		  System.out.println("");
	}
	
	// metodo mostrar heroes
	public void EligeHeroe(int RegionElegido) {
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("  _   _                \r\n"
        		+ " | | | | ___ _ __ ___  \r\n"
        		+ " | |_| |/ _ \\ '__/ _ \\ \r\n"
        		+ " |  _  |  __/ | | (_) |\r\n"
        		+ " |_| |_|\\___|_|  \\___/ \r\n"
        		+ "                       ");
        System.out.println("___________________________________________");

        System.out.println("");
        System.out.println("");
    if(RegionElegido == 1) {
          System.out.println("ºElige el tipo de heroe :");
          System.out.println();
          System.out.println("⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️");
          System.out.println("1 - Yasuo (1000 HP - 100 DAMAGE - 25 ARMOR)");
          System.out.println("");
          System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹");
          System.out.println("2 - Lux (1000 HP - 25 DAMAGE - 100 ARMOR)");

	}else if (RegionElegido == 2) {
        System.out.println("ºElige el tipo de heroe :");
        System.out.println("");
        System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
        System.out.println("1 - Katarina (500 HP - 100 DAMAGE - 25 ARMOR)");
        System.out.println("");
        System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
        System.out.println("2 - Darius (500 HP - 25 DAMAGE - 100 ARMOR)");
	}
	}
	
	// metodo mostrar la mapa para cada jugador
	public void EligeMap(String Personaje) {
		System.out.println("");
          System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
          System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
          System.out.println("");
          System.out.println("🛡️ 🗡️ ⚒️ 🛡️ Aqui puedes elegir en que posicion colocar tu heroe "+ Personaje+ "! 🛡️ 🗡️ ⚒️ 🛡️ 🗡️ ⚒️");
          System.out.println("");
          System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ ");
          System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
          
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
	
	// metodo spam para ocultar textos o pasos anteriores
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
	
	// metodo ASCII para empezar
	public void start() {
		System.out.println(" (                     (            \r\n"
				+ " )\\ )  *   )    (      )\\ )  *   )  \r\n"
				+ "(()/(` )  /(    )\\    (()/(` )  /(  \r\n"
				+ " /(_))( )(_))((((_)(   /(_))( )(_)) \r\n"
				+ "(_)) (_(_())  )\\ _ )\\ (_)) (_(_())  \r\n"
				+ "/ __||_   _|  (_)_\\(_)| _ \\|_   _|  \r\n"
				+ "\\__ \\  | |     / _ \\  |   /  | |    \r\n"
				+ "|___/  |_|    /_/ \\_\\ |_|_\\  |_|    \r\n"
				+ "                                    ");
	}
	// metodo ASCII para ganador
	public void winner() {
		System.out.println("           (        )     )       (     \r\n"
				+ " (  (      )\\ )  ( /(  ( /(       )\\ )  \r\n"
				+ " )\\))(   '(()/(  )\\()) )\\()) (   (()/(  \r\n"
				+ "((_)()\\ )  /(_))((_)\\ ((_)\\  )\\   /(_)) \r\n"
				+ "_(())\\_)()(_))   _((_) _((_)((_) (_))   \r\n"
				+ "\\ \\((_)/ /|_ _| | \\| || \\| || __|| _ \\  \r\n"
				+ " \\ \\/\\/ /  | |  | .` || .` || _| |   /  \r\n"
				+ "  \\_/\\_/  |___| |_|\\_||_|\\_||___||_|_\\  \r\n"
				+ "                                        ");
	}
	
	// metodo de atacar y aplicacion de sus efectos
	public void atack(String nombreJugadorAt , Personaje atacante , Personaje RecibirAtace , int dondeatacar , int mapa2 , Map mapa ) {

		if(dondeatacar == mapa2) {
			// aunque lo marca correctamente en mapa si el heroe en dicha posicion no esta vivo 
			// mostrara que no hay nadie aqui!
			if(RecibirAtace.getVida()<1) {
				System.out.println("    ______    _______    ________  \r\n"
						+ "   /    \" \\  |   __ \"\\  /\"       ) \r\n"
						+ "  // ____  \\ (. |__) :)(:   \\___/  \r\n"
						+ " /  /    ) :)|:  ____/  \\___  \\    \r\n"
						+ "(: (____/ // (|  /       __/  \\\\   \r\n"
						+ " \\        / /|__/ \\     /\" \\   :)  \r\n"
						+ "  \\\"_____/ (_______)   (_______/   \r\n"
						+ "                                   ");
				System.out.println("En esta posicion no hay nadie !!");
				System.out.println("");
			}else {
				// metodo de aplicacion de ataque con sus efectos
				System.out.println("");
			System.out.println("");
			   System.out.println(" (        )   (      (        )   (      (        )   (     \r\n"
				   		+ " )\\ )  ( /(   )\\ )   )\\ )  ( /(   )\\ )   )\\ )  ( /(   )\\ )  \r\n"
				   		+ "(()/(  )\\()) (()/(  (()/(  )\\()) (()/(  (()/(  )\\()) (()/(  \r\n"
				   		+ " /(_))((_)\\   /(_))  /(_))((_)\\   /(_))  /(_))((_)\\   /(_)) \r\n"
				   		+ "(_))    ((_) (_))   (_))    ((_) (_))   (_))    ((_) (_))   \r\n"
				   		+ "/ __|  / _ \\ / __|  / __|  / _ \\ / __|  / __|  / _ \\ / __|  \r\n"
				   		+ "\\__ \\ | (_) |\\__ \\  \\__ \\ | (_) |\\__ \\  \\__ \\ | (_) |\\__ \\  \r\n"
				   		+ "|___/  \\___/ |___/  |___/  \\___/ |___/  |___/  \\___/ |___/  \r\n"
				   		+ "                                                            ");
			   atacante.atacar();
			   
		
			//para poder localizar en mapa el jugador tenemos que obtener la vida antes de que recibe el ataque	
			int anteAtaque = RecibirAtace.getVida();
			RecibirAtace.defender(atacante.ataque);
			int vidaActual = RecibirAtace.getVida();
	
			//colocamos el heroe otra vez en mapa sin cambiar su posicion pero con su vida nueva
			mapa.placePlayer(anteAtaque,vidaActual);
			
	           System.out.println("Daño realizado :");
	           System.out.println("---> " + ( RecibirAtace.defensa - atacante.ataque));
	           System.out.println("Daño bloqueado : ");
	           System.out.println("---> " + ( RecibirAtace.defensa ));
	           System.out.println("");
	           System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
	           System.out.println("🏹 🧙   FIN DEL TURNO PARA "+ nombreJugadorAt+"! 🏹 🧙");
	           System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
	           System.out.println("");
	           System.out.println("");}
		}else {
			// si en dicha posicion no hay ningun heroe :
			System.out.println("    ______    _______    ________  \r\n"
					+ "   /    \" \\  |   __ \"\\  /\"       ) \r\n"
					+ "  // ____  \\ (. |__) :)(:   \\___/  \r\n"
					+ " /  /    ) :)|:  ____/  \\___  \\    \r\n"
					+ "(: (____/ // (|  /       __/  \\\\   \r\n"
					+ " \\        / /|__/ \\     /\" \\   :)  \r\n"
					+ "  \\\"_____/ (_______)   (_______/   \r\n"
					+ "                                   ");
			System.out.println("En esta posicion no hay nadie !!");
		}
	}

	// menu de posibles ataques para verificar si el enemigo vive antes que atacar!
	public void posiblesAtaces(String p1 , String p2 , Personaje Personaje1 , Personaje Personaje2) {
		if(Personaje1.getVida()>0) {
		System.out.println("A " + p1 + " (1)");}
		if(Personaje2.getVida()>0) {
		System.out.println("A " + p2 + " (2)");}

	
	}


	// para pasar el turno uno a otro jugador mientras enemigo esta vivo (!turno=0) y que va con el orden (1->2->3->4)
	public int v111(Personaje primer , Personaje seg , Personaje terc , int turno) {
		if(primer.getVida()>0){
			turno = 2;
		}else if(seg.getVida()>0) {
			turno = 3;
		}else if(terc.getVida()>0) {
			turno = 4;
		}else{
			turno = 0;
		}return turno;
	}
	public int v222(Personaje primer , Personaje seg , int turno) {
		if(primer.getVida()>0) {
			turno = 3;
		}else if(seg.getVida()>0) {
			turno = 4;
		}else {
			turno = 0;
		}return turno;
	}
	public int v333(Personaje primer , Personaje seg , Personaje terc , int turno) {
		if(primer.getVida()>0){
			turno = 4;
		}else if(seg.getVida()>0) {
			turno = 1;
		}else if(terc.getVida()>0) {
			turno = 2;
		}else{
			turno = 0;
		}return turno;
	}
	public int v444(Personaje primer , Personaje seg , int turno) {
		if(primer.getVida()>0) {
			turno = 1;
		}else if(seg.getVida()>0) {
			turno = 2;
		}else {
			turno = 0;
		}return turno;
	}
	
	

	
	
}
