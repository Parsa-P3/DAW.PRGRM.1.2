package TFP;

public class asdad {

	public static void turno(boolean atacante1 , Personaje jugador1 , Personaje jugador2) {
		
		 if(empezar ==1) {
             System.out.println("Jugador 1 elige tu accion!");
             System.out.println("Pas (0)");
             if(atacante1) {
             	System.out.println("Atacar (1)");

             }else {
             	System.out.println("Atacar (1)");
             	System.out.println("Curar (2)");
             
             }
             
             int action1 = sc.nextInt();
             
             if(atacante1) {
             if (action1 == 1) {
             	System.out.println("A donde quieres atacar ? ");
             	int focus = sc.nextInt();
             	if (focus == buscaEnMapjg2) {
             	jugador1.atacar();
             	int anteAtaque = jugador2.getVida();
             	jugador2.defender(jugador1.ataque);
//                 jugador2.setVida(jugador1.ataque);
                 int vidaActual = jugador2.getVida();
                 
//             	  System.out.println("Updated map for player 2:");
             	  mapjugador2.placePlayer(anteAtaque,vidaActual);
//                   mapjugador2.printMap();
                  System.out.println("Daño realizado :");
                  System.out.println("---> " + ( jugador2.defensa - jugador1.ataque));
                  System.out.println("Daño bloqueado : ");
                  System.out.println("---> " + ( jugador2.defensa ));
             	}else {
             		System.err.println("🤐 😓 🤐 😓 🤐 😓 🤐 😓 🤐 😓");
             		System.out.println(" Que pena , Alli no hay nadie! ");
             		System.err.println("🤐 😓 🤐 😓 🤐 😓 🤐 😓 🤐 😓");
             		System.out.println("");
             		System.out.println("Fin del turno para jugador 1");
             	 }
             }}else {
             		 if (action1 == 1) {
                      	System.out.println("A donde quieres atacar ? ");
                      	int focus = sc.nextInt();
                      	if (focus == buscaEnMapjg2) {
                      	jugador1.atacar();
                      	int anteAtaque = jugador2.getVida();
                      	jugador2.defender(jugador1.ataque);
//                          jugador2.setVida(jugador1.ataque);
                          int vidaActual = jugador2.getVida();
                          
//                      	  System.out.println("Updated map for player 2:");
                      	  mapjugador2.placePlayer(anteAtaque,vidaActual);
//                            mapjugador2.printMap();
                           System.out.println("Daño realizado :");
                           System.out.println("---> " + ( jugador2.defensa - jugador1.ataque));
                           System.out.println("Daño bloqueado : ");
                           System.out.println("---> " + ( jugador2.defensa ));
                      	}else {
                      		System.err.println("🤐 😓 🤐 😓 🤐 😓 🤐 😓 🤐 😓");
                      		System.out.println(" Que pena , Alli no hay nadie! ");
                      		System.err.println("🤐 😓 🤐 😓 🤐 😓 🤐 😓 🤐 😓");
                      		System.out.println("");
                      		System.out.println("Fin del turno para jugador 1");
                      	 }
             		  }else if(action1 == 2) {
             			 System.out.println("A quien quieres curar ?");
             			 System.out.println("A ti mismo (1)");
             			 System.out.println("A ");
             		 }
             	}
             	empezar = 2 ;
         
             }

	}

}
