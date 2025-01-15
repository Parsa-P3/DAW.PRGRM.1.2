package restaurante;

public class platos {
    private  String Descripcion;
    private double precio ;

    public platos(String Descripcion, double precio) {
        this.Descripcion = Descripcion;
        this.precio = precio;
    }

    public void info(){
        System.out.println("Descripcion de plato es : " + Descripcion);
        System.out.println("Precio de plato es : " + precio);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
