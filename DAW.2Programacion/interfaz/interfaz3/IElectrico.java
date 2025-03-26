package interfaz3;

public interface IElectrico extends IVehiculo {
    
    public void cargarBateria();
    default void activarPilotoAutomatico(){
        System.out.println("Modo auto activado!");
    };
}
