package TFP;

public class HeroeAtaque extends Personaje{

    public HeroeAtaque(String nombre, Region region) {
        super(nombre, 500, 100, 25, region);
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
        System.out.println(nombre + " Defendio ! Vida restante:  " + vida);
        return vida;
    }
    
}
