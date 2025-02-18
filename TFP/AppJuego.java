package TFP;

import java.util.Arrays;
import java.util.Scanner;

public class AppJuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creacion de hero
        System.out.println("Choose the region of youre hero player1 :");

        System.out.println("1 - Ionia (HP +60, DAMAGE +5, ARMOR +20)");
        System.out.println("2 - Noxus (HP +30, DAMAGE +25, ARMOR +15)");
        int secimRegion = sc.nextInt();

        Personaje jugador1 = null; ;

        boolean atacante1 = true;
        
        if (secimRegion == 1) {
            Region region = new Ionia();
            System.out.println(" Choose youre hero type :");
            System.out.println("1 - Assasin (25 HP - 10 DAMAGE - 2 ARMOR)");
            System.out.println("2 - Defender (40 HP - 2 DAMAGE - 10 ARMOR)");
            int secimHero = sc.nextInt();
                if (secimHero == 1) {
                    jugador1 =  new HeroeAtaque("Assasin", region);  
                    atacante1 = true;
                    
                }else if(secimHero==2){
                    jugador1 = new HeroeDefensa("Defender", region);
                    atacante1 = false;
                    
                }

        } else if (secimRegion == 2) {
            System.out.println(" Choose youre hero type :");
            System.out.println("1 - Assasin (25 HP - 10 DAMAGE - 2 ARMOR)");
            System.out.println("2 - Defender (40 HP - 2 DAMAGE - 10 ARMOR)");
            int secimHero = sc.nextInt();
            Region region = new Noxus();
                 if (secimHero == 1) {
                	  jugador1 =  new HeroeAtaque("Assasin", region); 
            
                   atacante1 = true;
                  }else if (secimHero == 2){
                      jugador1 = new HeroeDefensa("Defender", region);
              
                    atacante1 = false;
                  }

        } else {
            System.out.println("OPTION NOT EXIST! PLEAS CHOOSE BETWEEN 1/2 ");
        }

        System.out.println("Hero asigned !");
        
        
            System.out.println(jugador1.toString());
            
       // creacion de map       
            int mapJugador1 [][]= {
            		{1,2,3},
            		{4,5,6},
            		{7,8,9}
            };
            
            System.out.println("Please choose the place for your hero ! ");
            
            for (int i = 0; i < 3; i++) {
				System.out.println(Arrays.toString(mapJugador1[i]));

			}
            int buscaEnMap1 = sc.nextInt();
            
            for (int i = 0; i < 3; i++) {

    			for (int j = 0; j < 3; j++) {
    				if(!(mapJugador1[i][j] == buscaEnMap1)) {
    					mapJugador1[i][j] = -2;
    				}
    				if (mapJugador1[i][j] == buscaEnMap1) {
    					mapJugador1[i][j] = jugador1.vida;
    				
    					}
    				
    			}}
            
            for (int i = 0; i < 3; i++) {
      				System.out.println(Arrays.toString(mapJugador1[i]));

      			}
            
            //////////////////////////////////////////////////////////////////////////
            
            System.out.println("Choose the region of youre hero player2 :");

            System.out.println("1 - Ionia (HP +60, DAMAGE +5, ARMOR +20)");
            System.out.println("2 - Noxus (HP +30, DAMAGE +25, ARMOR +15)");
            int secimRegion2 = sc.nextInt();

            Personaje jugador2 = null; ;

            boolean atacante2 = true;
            
            if (secimRegion2 == 1) {
                Region region2 = new Ionia();
                System.out.println(" Choose youre hero type :");
                System.out.println("1 - Assasin (25 HP - 10 DAMAGE - 2 ARMOR)");
                System.out.println("2 - Defender (40 HP - 2 DAMAGE - 10 ARMOR)");
                int secimHero2 = sc.nextInt();
                    if (secimHero2 == 1) {
                        jugador2 =  new HeroeAtaque("SAVASCI", region2);  
                        atacante2 = true;
                        
                    }else if(secimHero2==2){
                        jugador2 = new HeroeDefensa("Koruyucu", region2);
                        atacante2 = false;
                        
                    }

            } else if (secimRegion2 == 2) {
                System.out.println(" Choose youre hero type :");
                System.out.println("1 - Assasin (25 HP - 10 DAMAGE - 2 ARMOR)");
                System.out.println("2 - Defender (40 HP - 2 DAMAGE - 10 ARMOR)");
                int secimHero2 = sc.nextInt();
                Region region2 = new Noxus();
                     if (secimHero2 == 1) {
                      jugador2 = new HeroeAtaque("Assasin", region2);
                
                       atacante2 = true;
                      }else if (secimHero2 == 2){
                       jugador2 = new HeroeDefensa("Defender", region2);
                  
                        atacante2 = false;
                      }

            } else {
                System.out.println("OPTION NOT EXIST! PLEAS CHOOSE BETWEEN 1/2 ");
            }

            System.out.println("Hero asigned!");
            
            
                System.out.println(jugador2.toString());
                
           // creacion de map       
                int mapJugador2 [][]= {
                		{1,2,3},
                		{4,5,6},
                		{7,8,9}
                };
                
                System.out.println("Please choose the place for your hero ! ");
                
                for (int i = 0; i < 3; i++) {
    				System.out.println(Arrays.toString(mapJugador2[i]));

    			}
                int buscaEnMap2 = sc.nextInt();
                
                for (int i = 0; i < 3; i++) {

        			for (int j = 0; j < 3; j++) {
        				if(!(mapJugador2[i][j] == buscaEnMap2)) {
        					mapJugador2[i][j] = -2;
        				}
        				if (mapJugador2[i][j] == buscaEnMap2) {
        					mapJugador2[i][j] = jugador2.vida;
        				
        					}
        				
        			}}
                
                for (int i = 0; i < 3; i++) {
          				System.out.println(Arrays.toString(mapJugador2[i]));

          			}

                System.out.println("Los jugadores han localizado sus heroes : ");
                for (int i = 0; i < 3; i++) {
          				System.out.println(Arrays.toString(mapJugador1[i]));

          			}
                for (int i = 0; i < 3; i++) {
      				System.out.println(Arrays.toString(mapJugador2[i]));

      			}
        ////////////////////////////////////////////////////////////////////
                
//                prueba de juego
                System.out.println("Player 1 Choose ur action !");
                System.out.println("Pass the turn without any action! (0)");
                if(atacante1) {
                	System.out.println("Attack (1)");
                	System.out.println("Defense (2)");
                }else {
                	System.out.println("Heal (3)");
                	System.out.println("Defense (2)");
                }
                int action1 = sc.nextInt();
                if (action1 == 1) {
                	jugador2.vida -= jugador1.ataque;
                }
                for (int i = 0; i < 3; i++) {
      				System.out.println(Arrays.toString(mapJugador2[i]));

      			}
    }

}
