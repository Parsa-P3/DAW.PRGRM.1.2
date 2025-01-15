package aeropuerto;

public class pasajeros {
    private  String nombrePasajero;
    private  int idPasajero;

    public pasajeros(String nombrePasajero , int idPasajero){
        this.nombrePasajero = nombrePasajero;
        this.idPasajero = idPasajero;



    }
    

    public void info(){
        System.out.println("********");
        System.out.println("Nombre de pasajero : " + nombrePasajero);
        System.out.println("ID de pasajero : " + idPasajero);
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    
}
