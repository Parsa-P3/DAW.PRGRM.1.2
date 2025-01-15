package aeropuerto;

public class vuelos {
    private  String codigoVuelo;
    private String origen;
    private  String destino;
    private  int capasidad;
    private  int asientosDisponibles;
    reservas reservas;

    public vuelos( String codigoVuelo , String origen , String destino , int capasidad , int asientosDisponibles){
        this.asientosDisponibles = asientosDisponibles;
        this.capasidad = capasidad ;
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.origen = origen;
    }

    public String getCodigoVuelo(){
        return codigoVuelo;
    }

    public void info(){
        System.out.println("Codigo del vuelo : " + codigoVuelo);
        System.out.println("Origen de vuelo : " + origen);
        System.out.println("Destino de vuelo : " + destino);
        System.out.println("Capasidad de vuelo : " + capasidad);
        System.out.println("Asientos disponibles de vuelo : " + asientosDisponibles);
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(int capasidad) {
        this.capasidad = capasidad;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int x) {
        this.asientosDisponibles = asientosDisponibles - x ;
    }
    
    public boolean  confirmar(){
        if (asientosDisponibles > 0){
            return true;

        }else{
            return false;
        }
    }

    public void actualizar(){
        asientosDisponibles = asientosDisponibles - reservas.getNumeroAsientosReserv();
    }
        

    
}
