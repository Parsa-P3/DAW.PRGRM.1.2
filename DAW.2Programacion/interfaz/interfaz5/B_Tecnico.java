package interfaz5;

public class B_Tecnico {
    private String nombre;
    private int idTecnico;
    // (1: disponible, 0: no disponible)
    private int dispon;
    // categoría (junior/senior)
    private String categoria;

    

    public B_Tecnico(String nombre, int idTecnico, int dispon, String categoria) {
        this.nombre = nombre;
        this.idTecnico = idTecnico;
        this.dispon = dispon;
        this.categoria = categoria;
    }

    // para cambiar la disponibilidad 
    public void cambiarDisp(int dispon){
        if(dispon == 1){
            dispon = 0;
            setDispon(dispon);
            
        }else{
            dispon = 1;
            setDispon(dispon);
           
        }
        
    }
    




    public void setDispon(int dispon) {
        this.dispon = dispon;
    }

    public String getNombre() {
        return nombre;
    }




    public int getIdTecnico() {
        return idTecnico;
    }




    public int getDispon() {
        return dispon;
    }




    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return  nombre ;
    }




    
}
