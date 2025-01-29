package biblioteca;

public class Libro {
	
	private String titulo;
	private String autor;
	private int anyo;
	
	
	
	
	public Libro(String titulo, String autor, int anyo) {
		this.titulo = titulo;
		this.autor = autor;
		this.anyo = anyo;
	}
	
	
	
	@Override
	public String toString() {
		return "El libro de " + titulo + ", fue escrito por " + autor + ", en el año " + anyo ;
	}



	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

}
