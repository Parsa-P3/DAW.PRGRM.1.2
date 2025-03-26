package interfaz3;

public interface IVehiculo {
    
    public void acelerar(boolean mod);

    default void frenar(){
        System.out.println("Frenando!");
    };

    default void encenderLuces(){
        System.out.println("Luces modificado!");

    };
    
    static void mostrarInfo(){
        System.out.println("Bienvenido a AppVehiculos");
    };
}
