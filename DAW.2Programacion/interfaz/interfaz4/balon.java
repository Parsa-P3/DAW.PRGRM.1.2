package interfaz4;

abstract class balon extends deporteEquipo{

    public balon(String entrenador, String liga, String nombreEquipo, int rankingEquipo) {
        super(entrenador, liga, nombreEquipo, rankingEquipo);
    }

    public void metod1(deporteEquipo x){
        System.out.println(x + " Se juega con balon");
    }
    
}
