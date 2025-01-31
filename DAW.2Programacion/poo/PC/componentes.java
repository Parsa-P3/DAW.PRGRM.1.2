package PC;

public class componentes {
    private String nombre;
    private String marca;
    private int tamanyo;


    public componentes(String nombre, String marca, int tamanyo) {
        this.nombre = nombre;
        this.marca = marca;
        this.tamanyo = tamanyo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getTamanyo() {
        return tamanyo;
    }
   
}
