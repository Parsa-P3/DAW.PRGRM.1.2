package EjemplosColecciones.Ej_1;

public class ej1_3_Contacto {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String[] Telefonos = new String[5];

    public ej1_3_Contacto(String nombre, String apellido1, String apellido2, String[] telefonos) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        Telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String[] getTelefonos() {
        return Telefonos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setTelefonos(int pos , String telefonos) {
        Telefonos[pos] = telefonos;
    }

    public void info( int x){
        System.out.println("Nombre : " + getNombre() + " 1ºApellido: " + getApellido1() + " 2ºApellido: " + getApellido2() + " Telefono: " + Telefonos[x]);

    }
    
}
