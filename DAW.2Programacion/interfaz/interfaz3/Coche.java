package interfaz.interfaz3;

public class Coche implements IVehiculo , IModoDeportivo{
    private String marca ;
    private String modelo;
    private int anyoFabricacion;
    private int velocidadActual;
    final int velocidad_max = 180;




    public Coche(String marca, String modelo, int anyoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.velocidadActual = 0;
        
    }


    
    @Override
    public String toString() {
        return "Coche marca=" + marca + ", modelo=" + modelo + ", anyoFabricacion=" + anyoFabricacion
                + ", velocidadActual=" + velocidadActual + ", velocidad_max=" + velocidad_max + "";
    }

    @Override
    public void acelerar(boolean mod) {
        if(activarModoDeportivo(mod) && (getVelocidadActual() < (getVelocidad_max() - 40))){
            
            setVelocidadActual(( getVelocidadActual() + 40));
            System.out.println("Acelerando!");
            System.out.println("--");
            System.out.println("Velocidad : ");
            System.out.println((getVelocidadActual() - 40)+ "-->"+ getVelocidadActual());
        }else if(getVelocidadActual() < (getVelocidad_max() - 20)){


            setVelocidadActual(( getVelocidadActual() + 20));
            System.out.println("Acelerando!");
            System.out.println("--");
            System.out.println("Velocidad : ");
            System.out.println((getVelocidadActual() - 20)+ "-->"+ getVelocidadActual());
        }else{
            System.out.println("No se puede acelerar!");
            System.out.println("Velocidad maxima alcanzada!");
        }
    }

    public void frenar(){
        if(!(getVelocidadActual() == 0)){
            setVelocidadActual(getVelocidadActual()-20);
            
            System.out.println((getVelocidadActual()+20)+ "-->" + getVelocidadActual() );
        }else{
            System.out.println("Coche parado!");
            
        }
    }











    public void setMarca(String marca) {
        this.marca = marca;
    }




    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }




    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }







    public String getMarca() {
        return marca;
    }




    public String getModelo() {
        return modelo;
    }




    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }




    public int getVelocidadActual() {
        return velocidadActual;
    }




    public int getVelocidad_max() {
        return velocidad_max;
    }




    
}
