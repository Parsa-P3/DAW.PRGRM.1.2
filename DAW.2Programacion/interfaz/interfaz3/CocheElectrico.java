package interfaz.interfaz3;

public class CocheElectrico extends  Coche implements IElectrico{

    private double nivelBateria ;

    public CocheElectrico(String marca, String modelo, int anyoFabricacion,double nivelBateria) {
        super(marca, modelo, anyoFabricacion);
        this.nivelBateria = nivelBateria;
    }

  

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    };

    public void acelerar(){
        if((getVelocidadActual() < (getVelocidad_max()-20))&&(getNivelBateria() > 0)){

            setVelocidadActual(( getVelocidadActual() + 20));
            setNivelBateria(getNivelBateria() - 5);
            System.out.println("Acelerando!");
            System.out.println("--");
            System.out.println("Velocidad : ");
            System.out.println((getVelocidadActual() - 20)+ "-->"+ getVelocidadActual());
            System.out.println("Bateria : ");
            System.out.println((getNivelBateria()+5)+ "% -->" + getNivelBateria()+ "% " );
        }else if (getNivelBateria() < 1){
            System.out.println("Necesario recargar la bateria !");

        }else if(getVelocidadActual() == getVelocidad_max()){
            System.out.println("Velocidad maxima alcanzada!");
        }
    }
   
    public void cargarBateria(){
        System.out.println("Bateria cargando . . .");
        setNivelBateria(100);
        System.out.println("Nivel actual de la bateria : " + getNivelBateria() + "%");
    }
    

}
