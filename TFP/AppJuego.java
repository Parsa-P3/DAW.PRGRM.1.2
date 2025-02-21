package TFP;

import java.util.Arrays;
import java.util.Scanner;

public class AppJuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        //creacion de personaje para jugador 1  y 2
        Personaje jugador1 = null; 
        Personaje jugador2 = null; 
        System.out.println("Como te llamas Jugador 1 ?");
        String nombreJugador1 = sc.nextLine();
        
        System.out.println("Como te llamas Jugador 2 ?");
        String nombreJugador2 = sc.nextLine();
        
        // creacion de turno
        turno turno1 = new turno (jugador1, jugador2);
        int turno = 1;
        
        // elegir region para heroe de jugador 1
        turno1.EligeRegion(turno, nombreJugador1, nombreJugador2);
        int secimRegion = sc.nextInt();
        
        
        boolean atacante1 = true;
        
        
        if (secimRegion == 1) {
            Region region = new Ionia();
            System.out.println("º---------------------------º");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println("ºElige el tipo de heroe :");
            System.out.println();
            System.out.println("⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️");
            System.out.println("1 - Yasuo (25 HP - 10 DAMAGE - 2 ARMOR)");
            System.out.println("");
            System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹");
            System.out.println("2 - Lux (40 HP - 2 DAMAGE - 10 ARMOR)");
            int secimHero = sc.nextInt();
                if (secimHero == 1) {
                    jugador1 =  new HeroeAtaque("Yasuo", region);  
                    atacante1 = true;
                    
                }else if(secimHero==2){
                    jugador1 = new HeroeDefensa("Lux", region);
                    atacante1 = false;
                    
                }

        } else if (secimRegion == 2) {
            System.out.println("º---------------------------º");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println(" --------------------------- ");
            System.out.println("ºElige el tipo de heroe :");
            System.out.println("");
            System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
            System.out.println("1 - Katarina (25 HP - 10 DAMAGE - 2 ARMOR)");
            System.out.println("");
            System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
            System.out.println("2 - Darius (40 HP - 2 DAMAGE - 10 ARMOR)");
            int secimHero = sc.nextInt();
            Region region = new Noxus();
                 if (secimHero == 1) {
                	  jugador1 =  new HeroeAtaque("Katarina", region); 
            
                   atacante1 = true;
                  }else if (secimHero == 2){
                      jugador1 = new HeroeDefensa("Darius", region);
              
                    atacante1 = false;
                  }

        } else {
            System.out.println("Opcion no existe porfavor eligen entre 1 o 2 ");
        }
        System.out.println("");
            System.out.println(jugador1.toString());
            System.out.println();
            
     
            //////////////////////////////////////////////////////////////////////////
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("Elige Region para heroe de jugador 2 :");
            System.out.println("");
            System.out.println("º 🥷 🥷 🥷 🥷 🥷 🥷 🥷  🥷 🥷 🥷 🥷 🥷 🥷 🥷 º");
            System.out.println("|1 - Ionia (HP +100, DAMAGE +50, ARMOR +25) |");
            System.out.println("|2 - Noxus (HP +50, DAMAGE +100, ARMOR +25) |");
            System.out.println("|___________________________________________|");
            int secimRegion2 = sc.nextInt();



            boolean atacante2 = true;
            
            if (secimRegion2 == 1) {
                Region region2 = new Ionia();
                System.out.println("º---------------------------º");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println("ºElige el tipo de heroe :");
                System.out.println("");
                System.out.println("⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️");
                System.out.println("1 - Yasuo (500 HP - 100 DAMAGE - 25 ARMOR)");
                System.out.println("");
                System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹");
                System.out.println("2 - Lux (500 HP - 25 DAMAGE - 100 ARMOR)");
                int secimHero2 = sc.nextInt();
                    if (secimHero2 == 1) {
                        jugador2 =  new HeroeAtaque("Yasuo", region2);  
                        atacante2 = true;
                        
                    }else if(secimHero2==2){
                        jugador2 = new HeroeDefensa("Lux", region2);
                        atacante2 = false;
                        
                    }

            } else if (secimRegion2 == 2) {
                System.out.println("º---------------------------º");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println("ºElige el tipo de heroe :");
                System.out.println("");
                System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
                System.out.println("1 - Katarina (500 HP - 100 DAMAGE - 25 ARMOR)");
                System.out.println("");
                System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
                System.out.println("2 - Darius (500 HP - 25 DAMAGE - 100 ARMOR)");
                int secimHero2 = sc.nextInt();
                Region region2 = new Noxus();
                     if (secimHero2 == 1) {
                      jugador2 = new HeroeAtaque("Katarina", region2);
                
                       atacante2 = true;
                      }else if (secimHero2 == 2){
                       jugador2 = new HeroeDefensa("Darius", region2);
                  
                        atacante2 = false;
                      }

            } else {
                System.out.println("Opcion no existe porfavor eligen entre 1 o 2");
            }
            
            //////////////////////////////jugador 3////////////////////////////////////////////
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("Elige Region para heroe de jugador 3 :");
            System.out.println("");
            System.out.println("º 🥷 🥷 🥷 🥷 🥷 🥷 🥷  🥷 🥷 🥷 🥷 🥷 🥷 🥷 º");
            System.out.println("|1 - Ionia (HP +100, DAMAGE +50, ARMOR +25) |");
            System.out.println("|2 - Noxus (HP +50, DAMAGE +100, ARMOR +25) |");
            System.out.println("|___________________________________________|");
            int secimRegion3 = sc.nextInt();

            Personaje jugador3 = null; ;

            boolean atacante3 = true;
            
            if (secimRegion2 == 1) {
                Region region3 = new Ionia();
                System.out.println("º---------------------------º");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println("ºElige el tipo de heroe :");
                System.out.println("");
                System.out.println("⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️");
                System.out.println("1 - Yasuo (500 HP - 100 DAMAGE - 25 ARMOR)");
                System.out.println("");
                System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹");
                System.out.println("2 - Lux (500 HP - 25 DAMAGE - 100 ARMOR)");
                int secimHero3 = sc.nextInt();
                    if (secimHero3 == 1) {
                        jugador3 =  new HeroeAtaque("Yasuo", region3);  
                        atacante3 = true;
                        
                    }else if(secimHero3==2){
                        jugador3 = new HeroeDefensa("Lux", region3);
                        atacante3 = false;
                        
                    }

            } else if (secimRegion3 == 2) {
                System.out.println("º---------------------------º");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println("ºElige el tipo de heroe :");
                System.out.println("");
                System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
                System.out.println("1 - Katarina (500 HP - 100 DAMAGE - 25 ARMOR)");
                System.out.println("");
                System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
                System.out.println("2 - Darius (500 HP - 25 DAMAGE - 100 ARMOR)");
                int secimHero3 = sc.nextInt();
                Region region3 = new Noxus();
                     if (secimHero3 == 1) {
                      jugador3 = new HeroeAtaque("Katarina", region3);
                
                       atacante3 = true;
                      }else if (secimHero3 == 2){
                       jugador3 = new HeroeDefensa("Darius", region3);
                  
                        atacante3 = false;
                      }

            } else {
                System.out.println("Opcion no existe porfavor eligen entre 1 o 2");
            }
            //////////////////////////////jugador 4////////////////////////////////////////////
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("Elige Region para heroe de jugador 3 :");
            System.out.println("");
            System.out.println("º 🥷 🥷 🥷 🥷 🥷 🥷 🥷  🥷 🥷 🥷 🥷 🥷 🥷 🥷 º");
            System.out.println("|1 - Ionia (HP +100, DAMAGE +50, ARMOR +25) |");
            System.out.println("|2 - Noxus (HP +50, DAMAGE +100, ARMOR +25) |");
            System.out.println("|___________________________________________|");
            int secimRegion4 = sc.nextInt();

            Personaje jugador4 = null; ;

            boolean atacante4 = true;
            
            if (secimRegion4 == 1) {
                Region region4 = new Ionia();
                System.out.println("º---------------------------º");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println("ºElige el tipo de heroe :");
                System.out.println("");
                System.out.println("⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️ ⚔️");
                System.out.println("1 - Yasuo (500 HP - 100 DAMAGE - 25 ARMOR)");
                System.out.println("");
                System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹");
                System.out.println("2 - Lux (500 HP - 25 DAMAGE - 100 ARMOR)");
                int secimHero4 = sc.nextInt();
                    if (secimHero4 == 1) {
                        jugador4 =  new HeroeAtaque("Yasuo", region4);  
                        atacante4 = true;
                        
                    }else if(secimHero4==2){
                        jugador4 = new HeroeDefensa("Lux", region4);
                        atacante4 = false;
                        
                    }

            } else if (secimRegion4 == 2) {
                System.out.println("º---------------------------º");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println(" --------------------------- ");
                System.out.println("ºElige el tipo de heroe :");
                System.out.println("");
                System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
                System.out.println("1 - Katarina (500 HP - 100 DAMAGE - 25 ARMOR)");
                System.out.println("");
                System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
                System.out.println("2 - Darius (500 HP - 25 DAMAGE - 100 ARMOR)");
                int secimHero4 = sc.nextInt();
                Region region4 = new Noxus();
                     if (secimHero4 == 1) {
                      jugador4 = new HeroeAtaque("Katarina", region4);
                
                       atacante4 = true;
                      }else if (secimHero4 == 2){
                       jugador4 = new HeroeDefensa("Darius", region4);
                  
                        atacante4 = false;
                      }

            } else {
                System.out.println("Opcion no existe porfavor eligen entre 1 o 2");
            }
            System.out.println(" ");
            System.out.println("Heroe para jugador 3 : ");
            System.out.println(jugador4.toString());
            System.out.println(" ");
            System.out.println("¡Heroes Asignados!");
            System.out.println(" ");
            System.out.println(jugador1.toString());
            System.out.println(jugador2.toString());
            System.out.println(jugador3.toString());
            System.out.println(jugador4.toString());
            
          
                


                
                /////////////////////////////////////////////

                //////////////////////////////////////////
                Map mapjugador1 = new Map();
                Map mapjugador2 = new Map();
                Map mapjugador3 = new Map();
                Map mapjugador4 = new Map();
                
                // 1. oyuncunun haritada bir yere yerleşmesi
                System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
                System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
                System.out.println("⛓️⛓️ Aqui puedes elegir en que posicion colocar tu heroe jugador1!⛓️⛓️⛓");
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
                int buscaEnMapjg1 = sc.nextInt();
                mapjugador1.placePlayer(buscaEnMapjg1, jugador1.getVida());  // Oyuncuyu yerleştir
                System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
                System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
                System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
                System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
                System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
                System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");

                // Haritayı yazdır
//                System.out.println("Map after player 1 has placed their hero:");
//                mapjugador1.printMap();
//                
                
                // 2. oyuncunun haritada bir yere yerleşmesi
                System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
                System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
                System.out.println("⛓️⛓️ Aqui puedes elegir en que posicion colocar tu heroe jugador2!⛓️⛓⛓");
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
                int buscaEnMapjg2 = sc.nextInt();
                mapjugador2.placePlayer(buscaEnMapjg2, jugador2.getVida());  // Oyuncuyu yerleştir


                // Haritayı yazdır
//                System.out.println("Map after player 2 has placed their hero:");
//                mapjugador2.printMap();
                ////////////////////////////////////////////////////////////////////
                // 3. oyuncunun haritada bir yere yerleşmesi
                System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
                System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
                System.out.println("⛓️⛓️ Aqui puedes elegir en que posicion colocar tu heroe jugador3!⛓️⛓⛓");
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
                int buscaEnMapjg3 = sc.nextInt();
                mapjugador3.placePlayer(buscaEnMapjg3, jugador3.getVida());  // Oyuncuyu yerleştir


                // Haritayı yazdır
//                System.out.println("Map after player 2 has placed their hero:");
//                mapjugador2.printMap();
                ////////////////////////////////////////////////////////////////////
                // 2. oyuncunun haritada bir yere yerleşmesi
                System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
                System.out.println("⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️⛓️");
                System.out.println("⛓️⛓️ Aqui puedes elegir en que posicion colocar tu heroe player1!⛓️⛓⛓");
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
                int buscaEnMapjg4 = sc.nextInt();
                mapjugador4.placePlayer(buscaEnMapjg4, jugador4.getVida());  // Oyuncuyu yerleştir
                
   // Haritayı yazdır
//                mapjugador1.printMap();
//                mapjugador2.printMap();
//                mapjugador3.printMap();
//                mapjugador4.printMap();
             
//                System.out.println("Map after player 2 has placed their hero:");
//                mapjugador2.printMap();
                ////////////////////////////////////////////////////////////////////
                
//                prueba de juego
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
                System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
                System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
                System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
                System.out.println("🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️ 🗡️");
                System.out.println("🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️ 🛡️ ⚒️");
                System.out.println("🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🏹 🧙 🏹 🧙 🏹 🧙");
                System.out.println("Quien va empezar primero ? ");
                int empezar = sc.nextInt();
                do {
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
//                    jugador2.setVida(jugador1.ataque);
                    int vidaActual = jugador2.getVida();
                    
//                	  System.out.println("Updated map for player 2:");
                	  mapjugador2.placePlayer(anteAtaque,vidaActual);
//                      mapjugador2.printMap();
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
//                             jugador2.setVida(jugador1.ataque);
                             int vidaActual = jugador2.getVida();
                             
//                         	  System.out.println("Updated map for player 2:");
                         	  mapjugador2.placePlayer(anteAtaque,vidaActual);
//                               mapjugador2.printMap();
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
            
                }else if(empezar == 2){
                    System.out.println("Jugador 2 elige tu accion!");
                    System.out.println("Pas (0)");
                    if(atacante1) {
                    	System.out.println("Atacar (1)");
                    	System.out.println("Defender (2)");
                    }else {
                      	System.out.println("Atacar (1)");
                    	System.out.println("Defender (2)");
                    	System.out.println("Curar (3)");
                    
                    }
                    
                    
                    int action1 = sc.nextInt();
                    
                 
                    if (action1 == 1) {
                    	System.out.println("A donde quieres atacar ? ");
                    	int focus = sc.nextInt();
                    	if (focus == buscaEnMapjg1) {
                    		jugador2.atacar();
                    	int anteAtaque = jugador1.getVida();
                    	 jugador1.defender(jugador1.ataque);
//                        jugador1.setVida(jugador2.ataque);
                        int vidaActual = jugador1.getVida();
                        
//                    	  System.out.println("Updated map for player 2:");
                    	  mapjugador1.placePlayer(anteAtaque,vidaActual);
//                          mapjugador2.printMap();
                          System.out.println("Daño realizado :");
                          System.out.println("---> " + (jugador1.defensa - jugador2.ataque ));
                          System.out.println("Daño bloqueado : ");
                          System.out.println("---> " + ( jugador1.defensa ));
                    	}else {
                    		System.err.println("🤐 😓 🤐 😓 🤐 😓 🤐 😓 🤐 😓");
                    		System.out.println(" Que pena , Alli no hay nadie! ");
                    		System.err.println("🤐 😓 🤐 😓 🤐 😓 🤐 😓 🤐 😓");
                    		System.out.println("");
                    		System.out.println("Fin del turno para jugador 1");
                    	}
                    	empezar = 3 ;
                    }
                }else if(empezar == 3) {
                	
                	
                	empezar = 4 ;
                }else if(empezar == 4) {
                	
                	
                	empezar = 1 ;
                }
                
                }while((jugador1.getVida()+jugador3.getVida()) >= 1 && (jugador2.getVida()+jugador4.getVida()) >= 1 );
                
                if(jugador1.getVida() < 1) {
                System.out.println("El ganador es : " + jugador2 );
                }else {
                	System.out.println("👏 👏 👏 👏 👏 👏 👏 👏 👏 👏 👏 ");
                    System.out.println("El ganador es : " + jugador1 );
                    System.out.println(" 👏 👏 👏 👏 👏 👏 👏 👏 👏 👏 👏");
                }


    }

}
