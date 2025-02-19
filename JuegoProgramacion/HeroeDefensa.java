package TFP;

public class HeroeDefensa extends Personaje {
    
    public HeroeDefensa(String nombre, Region region) {
        super(nombre, 500, 25 , 100, region);
    }


    @Override
    public void atacar() {
    	System.out.println(nombre + " Atacado!");
    }

    @Override
    public int defender(int dano) {
        int recibido = dano - defensa;
        if (recibido > 0) {
            vida -= recibido;
        }
        System.out.println(nombre + " Defendio ! Vida restante: " + vida);
        return vida;
    }
}
