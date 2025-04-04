package interfaz5;

public class B_Cliente {
    private String Nombre;
    private int id;
    private String direccion;
    private boolean esVIP;
    
    public B_Cliente(String nombre, int id, String direccion, boolean esVIP) {
        Nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.esVIP = esVIP;
    }

    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }


    public String getNombre() {
        return Nombre;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isEsVIP() {
        return esVIP;
    }

    
}
