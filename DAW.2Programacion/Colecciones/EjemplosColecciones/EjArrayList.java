package EjemplosColecciones;

import java.util.ArrayList;
import java.util.List;

public class EjArrayList {
    
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Naranja");
        frutas.add("Manzana"); // en una Lista se permite duplicados

        //imprime el contenido del ArrayList:
        System.out.println("Listado de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        //accesos a elemntos del ArrayList
        System.out.println("Primera fruta de la lista: "+ frutas.get(0));
        System.out.println("El tamaño de la lista es: "+ frutas.size());
        //busqueda de un elemento
        if(frutas.contains("Patata")){
            System.out.println("Hay patatas en la lista! ");
        }else{
            System.out.println("No hay patatas en la lista!");
        }
    }
}
