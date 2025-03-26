package interfaz.interfaz4;

abstract class deporteEquipo implements ReglasComunes{
    public String Entrenador;
    public String Liga;
    public String nombreEquipo;
    public int rankEquipo;

    public deporteEquipo(String entrenador, String liga, String nombreEquipo, int rankingEquipo) {
        Entrenador = entrenador;
        Liga = liga;
        this.nombreEquipo = nombreEquipo;
        this.rankEquipo = rankingEquipo;
    }

    
    public void competicionDeporteEquipo(deporteEquipo x , deporteEquipo y , String z){

        System.out.println("El partido Realizado en " + z);
        System.out.println(x.nombreEquipo +  " VS " + y.nombreEquipo);

        int random = (int)(Math.random()*8)+1;

        // si un equipo tiene un ranking superior al otro tendra 25% mas posibilidad de ganar
        if(x.rankEquipo > y.rankEquipo){
            while(random == 1 ){
                random = (int)(Math.random()*8)+1;
            }
        }else{
            while(random == 2 ){
                random = (int)(Math.random()*8)+1;
            }
        }
        if(random % 2 == 0){
            System.out.println("El ganador es " + x.nombreEquipo);
        }else{
            System.out.println("El ganador es " + y.nombreEquipo);
        }
    }

   
    
    // public abstract void competicion(int rank1 , int rank2);
    
}
