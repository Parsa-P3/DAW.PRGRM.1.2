public class Libro{
    private String titulo;
    private String autor;
    private int anyoPublicacion;

    public Libro(int anyoPublicacion, String autor, String titulo) {
        this.anyoPublicacion = anyoPublicacion;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", anyoPublicacion=").append(anyoPublicacion);
        sb.append('}');
        return sb.toString();
    }


    
    
}