package aeropuerto;

public class reservas {
     vuelos vuelo;
     pasajeros pasajeros;
     private int numeroAsientosReserv;

    public reservas(int numeroAsientosReserv, pasajeros pasajeros, vuelos vuelo) {
        this.numeroAsientosReserv = numeroAsientosReserv;
        this.pasajeros = pasajeros;
        this.vuelo = vuelo;
    }


    public vuelos getVuelo() {
        return vuelo;
    }

    
    public int getNumeroAsientosReserv() {
        return numeroAsientosReserv;
    }

    public void setNumeroAsientosReserv(int numeroAsientosReserv) {
        this.numeroAsientosReserv = numeroAsientosReserv;
    }


    public void info(){
        System.out.println("Detalles de reserva ");
        System.out.println(" ******************* ");
        System.out.println("Detalles : " + numeroAsientosReserv + " Asientos para vuelo de " + vuelo.getCodigoVuelo() +  " a nombre de " + pasajeros.getNombrePasajero());

    }

 

    

     



    


}
