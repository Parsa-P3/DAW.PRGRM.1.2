package Coches;
public class AppCoche {

    public static void main(String[] args) {
        Coche coche = new Coche();

        System.out.println("Listas de los Ruedas:");
       
        coche.addRuedas("Pirelli Scorpion-----", "195/55R1687V");
        coche.addRuedas("Pirelli Winter -----" , "195/55R1687V");
        coche.addRuedas("Pirelli Winter -----" , "195/55R1687V");
        coche.addRuedas("Pirelli Scorpion-----" , "195/55R1687V");
        coche.addRuedas("Pirelasdasdli -----" , "195/55R1687V");

        coche.mostrarRuedas();

    }
}