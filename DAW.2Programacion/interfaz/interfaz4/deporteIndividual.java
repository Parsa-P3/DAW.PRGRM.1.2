package interfaz.interfaz4;

abstract class deporteIndividual implements ReglasComunes{
    public String Entrenador;
    public String Liga;

    public deporteIndividual(String entrenador, String liga) {
        this.Entrenador = entrenador;
        this.Liga = liga;
    }


   
    
    // public abstract void competicion(int rank1 , int rank2);
    
}
