
import java.util.ArrayList;
import java.util.Iterator;

public class GestionBiblioteca{
    private ArrayList<Libro> libros ;

    public GestionBiblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }
// Kitap ekleme metodu
     public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void validarLibro(Libro libro) throws LibroInvalidoException {
    if (libro.getTitulo() == null || libro.getTitulo().isEmpty()) {
        throw new LibroInvalidoException("El título del libro está vacío.");
    }
    if (libro.getAutor() == null || libro.getAutor().isEmpty()) {
        throw new LibroInvalidoException("El autor del libro está vacío.");
    }
    if (libro.getAnyoPublicacion() < 0) {
        throw new LibroInvalidoException("El año de publicación no es válido.");
    }
}

    public void imprimirLibrosPosterioresA(int anyo){
        Iterator<Libro> iterator = libros.iterator();


        while (iterator.hasNext()) {
        Libro libro = iterator.next(); // sıradaki kitabı al
        
        try {
            validarLibro(libro); // kitap geçerli mi diye kontrol et
            if (libro.getAnyoPublicacion() < anyo) {
                System.out.println(libro);
            }
        } catch (LibroInvalidoException e) {
            System.out.println("Libro inválido: " + e.getMessage());
        }
    }

    }
}