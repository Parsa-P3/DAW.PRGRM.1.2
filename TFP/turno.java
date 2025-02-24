package TFP;
//clase utilizando para evitar codigos y textos duplicados y manejar bien el orden del turno
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
	
	
	public void turnoQ(String  z ) {
		System.out.println("Elige uno de los opciones " + z +" :");
		
         	System.out.println("Atacar (1)");
         	System.out.println("Curar (2)");
         
         
		
	}
	
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
	
	
	public void atack(String nombreJugadorAt , Personaje atacante , Personaje RecibirAtace , int dondeatacar , int mapa2 , Map mapa ) {

		if(dondeatacar == mapa2) {
			atacante.atacar();
				
				int anteAtaque = RecibirAtace.getVida();
			RecibirAtace.defender(atacante.ataque);
			int vidaActual = RecibirAtace.getVida();
	
			mapa.placePlayer(anteAtaque,vidaActual);
			   System.out.println(" (        )   (      (        )   (      (        )   (     \r\n"
			   		+ " )\\ )  ( /(   )\\ )   )\\ )  ( /(   )\\ )   )\\ )  ( /(   )\\ )  \r\n"
			   		+ "(()/(  )\\()) (()/(  (()/(  )\\()) (()/(  (()/(  )\\()) (()/(  \r\n"
			   		+ " /(_))((_)\\   /(_))  /(_))((_)\\   /(_))  /(_))((_)\\   /(_)) \r\n"
			   		+ "(_))    ((_) (_))   (_))    ((_) (_))   (_))    ((_) (_))   \r\n"
			   		+ "/ __|  / _ \\ / __|  / __|  / _ \\ / __|  / __|  / _ \\ / __|  \r\n"
			   		+ "\\__ \\ | (_) |\\__ \\  \\__ \\ | (_) |\\__ \\  \\__ \\ | (_) |\\__ \\  \r\n"
			   		+ "|___/  \\___/ |___/  |___/  \\___/ |___/  |___/  \\___/ |___/  \r\n"
			   		+ "                                                            ");
	           System.out.println("Daño realizado :");
	           System.out.println("---> " + ( RecibirAtace.defensa - atacante.ataque));
	           System.out.println("Daño bloqueado : ");
	           System.out.println("---> " + ( RecibirAtace.defensa ));
	           System.out.println("");
	           System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
	           System.out.println("🏹 🧙   FIN DEL TURNO PARA "+ nombreJugadorAt+"! 🏹 🧙");
	           System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
	           System.out.println("");
	           System.out.println("");
		}else {
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

	public void posiblesAtaces(String p1 , String p2 , Personaje Personaje1 , Personaje Personaje2) {
		if(Personaje1.getVida()>0) {
		System.out.println("A " + p1 + " (1)");}
		if(Personaje2.getVida()>0) {
		System.out.println("A " + p2 + " (2)");}

	
	}


	public int vivo11(boolean vivog , boolean vivoP , boolean vivoS , boolean vivot , boolean vivor , Personaje Personaje , int turno) {
		if(Personaje.getVida()<1) {
			vivor = false;
		}
		
		if(vivoP) {
			turno = 2;
		}else if(vivoS) {
			turno = 3;
		}else if(vivot) {
			turno = 4;
		}else {
			vivog = false;
		}
		return turno;
	}
	
	public int vivo2(boolean vivo ,boolean vivo3 , boolean vivo4, boolean vivoS , Personaje Personaje1 , int turno) {
		if(Personaje1.getVida()<1) {
			vivoS = false;
			vivo4 = vivoS ;
		}
		
		 if(vivo3) {
			turno = 3;
		}else if(vivo4) {
			turno = 4;
		}else {
			vivo = false;
		}
		
			return turno;
	}

     public int vivo3(boolean vivoGeneral , boolean primerOp , boolean SegundoOp , boolean elQueRecibe, Personaje Personaje , int turno) {
		if(Personaje.getVida()<1) {
			elQueRecibe = false;
		}
		
		if(primerOp) {
			turno = 4;
		}else if(SegundoOp) {
			turno = 1;
		}else if(elQueRecibe) {
			turno = 2;
		}else {
			vivoGeneral = false;
		}
		return turno;
	}
     
     public int vivo4(boolean vivoGeneral , boolean P , boolean S , boolean R , Personaje Personaje , int turno ) {
    	 if(Personaje.getVida()<1) {
    		 R = false;
    	 }
    	 
    	 if(P) {
    		 turno = 1;
    	 }else if(S) {
    		 turno = 2;
    	 }else {
    		 vivoGeneral = false;
    	 }
    		return turno;
     }
     
	
	
}
