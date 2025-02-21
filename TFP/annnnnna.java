package TFP;

import java.util.Scanner;

public class annnnnna {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
	        //creacion de personaje para jugador 1  y 2
	        Personaje jugador1 = null; 
	        Personaje jugador2 = null; 
	        Personaje jugador3 = null; 
	        Personaje jugador4 = null; 
	        
	        //creacion de regiones
	        Region Region1 = new Ionia(); 
	        Region Region2 = new Noxus();
	        
	        String nombreJugador1 = "";
	        String nombreJugador2 = "";
	        String nombreJugador3 = "";
	        String nombreJugador4 = ""; 
	        
	        // preguntar y asignar los nombres de los jugadores
	        for (int i = 0; i < 4; i++) {
	        	 System.out.println("Como te llamas Jugador " + (i+1) + " ?" ); 
	        	
	        	 if (i == 0) {
	        		  nombreJugador1 = sc.nextLine();
	        	 }
	        	 if (i == 1) {
	        		 nombreJugador2 = sc.nextLine();
	        	 }
	        	 if (i == 2) {
	        		 nombreJugador3 = sc.nextLine();
	        	 }
	        	 if (i == 3) {
	        		 nombreJugador4 = sc.nextLine();
	        	 }
			}
	        

	      
	        
	        // creacion de turno
	        turno turno1 = new turno (jugador1, jugador2);
	        
	        
	        // elegir region para heroe de jugador 1
	        turno1.EligeRegion( nombreJugador1 );
	        int secimRegion = sc.nextInt();
		
	        turno1.EligeHeroe(secimRegion);
	        int HERO = sc.nextInt();

	        

	        // Asignar al jugador heroe elegido para jugador 1 (crear)
	      if(secimRegion ==1) {
	    	   if(HERO == 1) {
	    		   	jugador1 = new HeroeAtaque("Yasuo" , Region1 );   
	    	   }else {
	    		   	jugador1 = new HeroeDefensa("Lux" , Region1 );  
	    	   }
	      }else {
	    	   if(HERO == 1) {
	    			 jugador1 = new HeroeAtaque("Katarina" , Region2 );
	    	   }else {
	    			 jugador1 = new HeroeDefensa("Darius" , Region2 );
	    	   }
	       }
	      
	      //////////////////////////////////////////////////////////////
	      
	       // elegir region para heroe de jugador 2
	      
	        turno1.EligeRegion(nombreJugador2);
	        int secimRegion2 = sc.nextInt();
		
	        turno1.EligeHeroe(secimRegion2);
	        int HERO2 = sc.nextInt();
	        
	        // Asignar al jugador heroe elegido para jugador 2 (crear)
	      if(secimRegion2 ==1) {
	    	   if(HERO2 == 1) {
	    		   	jugador2 = new HeroeAtaque("Yasuo" , Region1 );   
	    	   }else {
	    		   	jugador2 = new HeroeDefensa("Lux" , Region1 );  
	    	   }
	      }else {
	    	   if(HERO2 == 1) {
	    			 jugador2 = new HeroeAtaque("Katarina" , Region2 );
	    	   }else {
	    			 jugador2 = new HeroeDefensa("Darius" , Region2 );
	    	   }
	       }
	       	
	      /////////////////////////////////////////////////////////////////
	       // elegir region para heroe de jugador 3
	  
	        turno1.EligeRegion(nombreJugador3);
	        int secimRegion3 = sc.nextInt();
		
	        turno1.EligeHeroe(secimRegion3);
	        int HERO3 = sc.nextInt();
	        
	        // Asignar al jugador heroe elegido para jugador 3 (crear)
	      if(secimRegion3 ==1) {
	    	   if(HERO3 == 1) {
	    		   	jugador3 = new HeroeAtaque("Yasuo" , Region1 );   
	    	   }else {
	    		   	jugador3 = new HeroeDefensa("Lux" , Region1 );  
	    	   }
	      }else {
	    	   if(HERO3 == 1) {
	    			 jugador3 = new HeroeAtaque("Katarina" , Region2 );
	    	   }else {
	    			 jugador3 = new HeroeDefensa("Darius" , Region2 );
	    	   }
	       }
	       	
	      //////////////////////////////////////////////////////////////////
	       // elegir region para heroe de jugador 4
		  
	        turno1.EligeRegion(nombreJugador4);
	        int secimRegion4 = sc.nextInt();
		
	        turno1.EligeHeroe(secimRegion4);
	        int HERO4 = sc.nextInt();
	        
	        // Asignar al jugador heroe elegido para jugador 4 (crear)
	      if(secimRegion4 ==1) {
	    	   if(HERO4 == 1) {
	    		   	jugador4 = new HeroeAtaque("Yasuo" , Region1 );   
	    	   }else {
	    		   	jugador4 = new HeroeDefensa("Lux" , Region1 );  
	    	   }
	      }else {
	    	   if(HERO4 == 1) {
	    			 jugador4 = new HeroeAtaque("Katarina" , Region2 );
	    	   }else {
	    			 jugador4 = new HeroeDefensa("Darius" , Region2 );
	    	   }
	       }
	       	
	      ////////////////////////////////////////////////////////////////////////////////
	      
	      System.out.println(jugador1.toString()+  ". (para " + nombreJugador1 +")");
	      System.out.println(jugador2.toString()+ ".  (para " + nombreJugador2 +")");
	      System.out.println(jugador3.toString()+ ".  (para " + nombreJugador3 +")");
	      System.out.println(jugador4.toString()+ ".  (para " + nombreJugador4 +")");
	      
	      // acabamos aqui con creacion y pasamos a juego
	      //////////////////////////////////////Colocar en mapa///////////////////////////////////////////////////////
	      // creamos mapas para cada jugador
	      Map mapjugador1 = new Map();
          Map mapjugador2 = new Map();
          Map mapjugador3 = new Map();
          Map mapjugador4 = new Map();
          
          //mostramos a cada jugador la mapa para que eligen
          turno1.EligeMap(jugador1);
          
          //colocamos en map los heroes
          int buscaEnMapjg1 = sc.nextInt();
          mapjugador1.placePlayer(buscaEnMapjg1, jugador1.getVida()); 
          turno1.spam();

 
          turno1.EligeMap(jugador2);
          int buscaEnMapjg2 = sc.nextInt();
          mapjugador2.placePlayer(buscaEnMapjg2, jugador2.getVida()); 
          turno1.spam();


          turno1.EligeMap(jugador3);
          int buscaEnMapjg3 = sc.nextInt();
          mapjugador3.placePlayer(buscaEnMapjg3, jugador3.getVida()); 
          turno1.spam();

  
          turno1.EligeMap(jugador4);
          int buscaEnMapjg4 = sc.nextInt();
          mapjugador4.placePlayer(buscaEnMapjg4, jugador4.getVida()); 
          turno1.spam();
          
          
          //////////////////////////////////////! Sistema de ataque !////////////////////////////////////////////////////////////
   do {
        int TurnoDeJugar = 1;
        if(TurnoDeJugar == 1) {
         System.out.println("A quien quieres atacar " + nombreJugador1 + "?");	
         turno1.posiblesAtaces(nombreJugador1, nombreJugador2, nombreJugador3, nombreJugador4);
         int aQuien = sc.nextInt();
         
  		 System.out.println("A donde quiere atacar " + nombreJugador1 +  "?" );
		 int dondeAtacar = sc.nextInt();
		 
		 if(aQuien == 1) {
			System.out.println("A ti mismo ? Que salvaje ! pero no puedes !");
   			System.out.println("🤐 😓 🤐 😓 🤐 😓 🤐 🤐 😓 🤐 😓 🤐 😓  🤐");
   			System.out.println("🤐 Fin del turno para este barbar!! 🤐");
   			System.out.println("🤐 😓 🤐 😓 🤐 😓 🤐 🤐 😓 🤐 😓 🤐 😓  🤐");
			TurnoDeJugar = 2;
		 }
		 if(aQuien == 2) {
			 turno1.atack( nombreJugador1,jugador1, jugador2, dondeAtacar, buscaEnMapjg2, mapjugador2);
			 TurnoDeJugar = 2;
		 }
		 if(aQuien == 3) {
			 turno1.atack(nombreJugador1, jugador1, jugador3, dondeAtacar, buscaEnMapjg3, mapjugador3);
			 TurnoDeJugar = 2;
		 }
		 if(aQuien == 4) {
			 turno1.atack(nombreJugador1, jugador1, jugador4, dondeAtacar, buscaEnMapjg4, mapjugador4);
			 TurnoDeJugar = 2;
		 }
		 
          
		        } if(TurnoDeJugar == 2) {
		            System.out.println("A quien quieres atacar " + nombreJugador2 + "?");	

		            turno1.posiblesAtaces(nombreJugador1, nombreJugador2, nombreJugador3, nombreJugador4);
		            int aQuien = sc.nextInt();
		            
		     		 System.out.println("A donde quiere atacar " + nombreJugador2 +  "?" );
		   		 int dondeAtacar = sc.nextInt();
		   		 
		   		 if(aQuien == 2) {
		   			System.out.println("A ti mismo ? Que salvaje ! pero no puedes !");
		   			System.out.println("🤐 😓 🤐 😓 🤐 😓 🤐 🤐 😓 🤐 😓 🤐 😓  🤐");
		   			System.out.println("🤐 Fin del turno para este barbar!! 🤐");
		   			System.out.println("🤐 😓 🤐 😓 🤐 😓 🤐 🤐 😓 🤐 😓 🤐 😓  🤐");
		   			TurnoDeJugar = 2;
		   		 }
		   		 if(aQuien == 1) {
		   			 turno1.atack( nombreJugador2,jugador2, jugador1, dondeAtacar, buscaEnMapjg1, mapjugador1);
		   			 TurnoDeJugar = 3;
		   		 }
		   		 if(aQuien == 3) {
		   			 turno1.atack(nombreJugador2, jugador2, jugador3, dondeAtacar, buscaEnMapjg3, mapjugador3);
		   			 TurnoDeJugar = 3;
		   		 }
		   		 if(aQuien == 4) {
		   			 turno1.atack(nombreJugador2, jugador2, jugador4, dondeAtacar, buscaEnMapjg4, mapjugador4);
		   			 TurnoDeJugar = 3;
		   		 }
			}
					        if(TurnoDeJugar == 3) {
					            System.out.println("A quien quieres atacar " + nombreJugador3 + "?");	

					            turno1.posiblesAtaces(nombreJugador1, nombreJugador2, nombreJugador3, nombreJugador4);
					            int aQuien = sc.nextInt();
					            
					     		 System.out.println("A donde quiere atacar " + nombreJugador3 +  "?" );
					   		 int dondeAtacar = sc.nextInt();
					   		 
					   		 if(aQuien == 3) {
					   			System.out.println("A ti mismo ? Que salvaje ! pero no puedes !");
					   			System.out.println("🤐 😓 🤐 😓 🤐 😓 🤐 🤐 😓 🤐 😓 🤐 😓  🤐");
					   			System.out.println("🤐 Fin del turno para este barbar!! 🤐");
					   			System.out.println("🤐 😓 🤐 😓 🤐 😓 🤐 🤐 😓 🤐 😓 🤐 😓  🤐");
					   			TurnoDeJugar = 4;
					   		 }
					   		 if(aQuien == 1) {
					   			 turno1.atack( nombreJugador3,jugador3, jugador1, dondeAtacar, buscaEnMapjg1, mapjugador1);
					   			 TurnoDeJugar = 4;
					   		 }
					   		 if(aQuien == 2) {
					   			 turno1.atack( nombreJugador3, jugador3, jugador2, dondeAtacar, buscaEnMapjg2, mapjugador2);
					   			 TurnoDeJugar = 4;
					   		 }
					   		 if(aQuien == 4) {
					   			 turno1.atack( nombreJugador3, jugador3, jugador4, dondeAtacar, buscaEnMapjg4, mapjugador4);
					   			 TurnoDeJugar = 4;
					   		 } }
									   	   if(TurnoDeJugar == 4) {
									            System.out.println("A quien quieres atacar " + nombreJugador4 + "?");	
				
									            turno1.posiblesAtaces(nombreJugador1, nombreJugador2, nombreJugador3, nombreJugador4);
									            int aQuien = sc.nextInt();
									            
									     		 System.out.println("A donde quiere atacar " + nombreJugador4 +  "?" );
									   		 int dondeAtacar = sc.nextInt();
									   		 
									   		 if(aQuien == 4) {
									   			System.out.println("A ti mismo ? Que salvaje ! pero no puedes !");
									   			System.out.println("🤐 😓 🤐 😓 🤐 😓 🤐 🤐 😓 🤐 😓 🤐 😓  🤐");
									   			System.out.println("🤐 Fin del turno para este barbar!! 🤐");
									   			System.out.println("🤐 😓 🤐 😓 🤐 😓 🤐 🤐 😓 🤐 😓 🤐 😓  🤐");
									   			
									   			TurnoDeJugar = 4;
									   		 }
									   		 if(aQuien == 1) {
									   			 turno1.atack(nombreJugador4 , jugador4, jugador1, dondeAtacar, buscaEnMapjg1, mapjugador1);
									   			 TurnoDeJugar = 1;
									   		 }
									   		 if(aQuien == 2) {
									   			 turno1.atack( nombreJugador4 , jugador4, jugador2, dondeAtacar, buscaEnMapjg2, mapjugador2);
									   			 TurnoDeJugar = 1;
									   		 }
									   		 if(aQuien == 3) {
									   			 turno1.atack(nombreJugador4 , jugador4, jugador1, dondeAtacar, buscaEnMapjg1, mapjugador1);
									   			 TurnoDeJugar = 1;
									   		 }
						}}while(jugador1.getVida() >= 1);
	}
}














