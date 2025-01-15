package restaurante;

public class mesas {
    private int numeroMesa;
    private  int capacidadMesa;
    private String estadoMesa;

    public mesas(int capacidadMesa, String estadoMesa, int numeroMesa) {
        this.capacidadMesa = capacidadMesa;
        this.estadoMesa = estadoMesa;
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidadMesa() {
        return capacidadMesa;
    }

    public void setCapacidadMesa(int capacidadMesa) {
        this.capacidadMesa = capacidadMesa;
    }

    public String getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(String estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    public void info(){
        System.out.println("Numereo de mesa : " + numeroMesa);
        System.out.println("Estado de mesa : " + estadoMesa);
        System.out.println("Capacidad de mesa : " + capacidadMesa);
    }

}

