package EjemplosIterador;

import java.util.ArrayList;
import java.util.Iterator;

public class Eiterador {
    
    public static void main(String[] args) {
        // crear array list de string para nombres
        ArrayList<String> nombres = new ArrayList<>();

        // añadir nombre  a la lista
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Sofia");

        // crear iterador para la lista de 'nombres'
        Iterator<String> iterator = nombres.iterator();

        System.out.println("Nombres en la lista:");

        while (iterator.hasNext()) {
            String nombre = iterator.next();
            if (nombre.equals("Luis")) {
                iterator.remove(); // para eliminar
                System.out.println("-----------------");
                System.out.println("Nombre eliminado :" + nombre);
                System.out.println("-----------------");
            }
          
        }
        for (String nom : nombres) {
            System.out.println(nom);
        }
    }
}
