package TFP;

import java.util.Arrays;
import java.util.Scanner;

public class AppJuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creacion de hero
        System.out.println("Bolge secimi");

        System.out.println("1 - Ionia (Vida +60, Ataque +5, Defensa +20)");
        System.out.println("2 - Noxus (Vida +30, Ataque +25, Defensa +15)");
        int secimRegion = sc.nextInt();

        Personaje jugador1 = null; ;

        boolean atacante = true;
        
        if (secimRegion == 1) {
            Region region = new Ionia();
            System.out.println(" Karakter Seçimi:");
            System.out.println("1 - Heroe de Ataque (25 can - 10 hasar - 2 zirh)");
            System.out.println("2 - Heroe de Defensa (40 can - 2 hasar - 10 zirh)");
            int secimHero = sc.nextInt();
                if (secimHero == 1) {
                    jugador1 =  new HeroeAtaque("SAVASCI", region);  
                    atacante = true;
                    
                }else if(secimHero==2){
                    jugador1 = new HeroeDefensa("Koruyucu", region);
                    atacante = false;
                    
                }

        } else if (secimRegion == 2) {
            System.out.println(" Karakter Seçimi:");
            System.out.println("1 - Heroe de Ataque (25 can - 10 hasar - 2 zirh)");
            System.out.println("2 - Heroe de Defensa (40 can - 2 hasar - 10 zirh)");
            int secimHero = sc.nextInt();
            Region region = new Noxus();
                 if (secimHero == 1) {
                  jugador1 = new HeroeAtaque("SAVASCI", region);
            
                   atacante = true;
                  }else if (secimHero == 2){
                   jugador1 = new HeroeDefensa("Koruyucu", region);
              
                    atacante = false;
                  }

        } else {
            System.out.println("Valor incorrecto ! Porfavor eligen 1 o 2. ");
        }

        System.out.println("Karakter olusturuldu");
        
        
            System.out.println(jugador1.toString());
            
       // creacion de map
            int[][] base1 = new int[3][3];
            int[][] base2 = new int[3][3];
            
            int map [][]= {
            		{0,0,0},
            		{0,0,0},
            		{0,0,0}
            };
            
            for (int i = 0; i < 3; i++) {
				System.out.println(Arrays.toString(map[i]));

			}
            
            System.out.println("vida restante: ");
            System.out.println("---");
            System.out.println("|*|");
            System.out.println("|*|");
            System.out.println("|*|");
            System.out.println("|*|");
       

    }

}
