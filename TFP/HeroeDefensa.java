package TFP;

public class HeroeDefensa extends Personaje {
    
    public HeroeDefensa(String nombreHeroe, Region region) {
        super(nombreHeroe, 500, 25 , 100, region);
    }


    @Override
    public void atacar() {
    	System.out.println(nombreHeroe + " Atacado!");
    }

    @Override
    public int defender(int dano) {
        int recibido = dano - defensa;
        if (recibido > 0) {
            vida -= recibido;
        }
        System.out.println(nombreHeroe + " Defendio ! Vida restante: " + vida);
        return vida;
    }
}
