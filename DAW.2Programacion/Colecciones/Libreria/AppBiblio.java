
import java.util.ArrayList;

public class AppBiblio{

    public static void main(String[] args) {
         ArrayList<Libro> Libros = new ArrayList<>();

         Libro l1 = new Libro(1981, "AUTOR1", "TITULO1");
         Libro l2 = new Libro(1982, "AUTOR2", "");
         Libro l3 = new Libro(-1, "AUTOR3", "TITULO3");
         Libro l4 = new Libro(1984, "" , "TITULO4");
         Libro l5 = new Libro(1985, "AUTOR5", "TITULO5");

        // añadir nombre  a la lista
        Libros.add(l1);
        Libros.add(l2);
        Libros.add(l3);
        Libros.add(l4);
        Libros.add(l5);

        GestionBiblioteca g1 = new GestionBiblioteca(Libros);

        g1.imprimirLibrosPosterioresA(1984);
        


    }
}