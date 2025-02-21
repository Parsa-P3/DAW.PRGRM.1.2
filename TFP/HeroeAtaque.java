package TFP;

public class HeroeAtaque extends Personaje{

    public HeroeAtaque(String nombreHeroe, Region region) {
        super(nombreHeroe, 500, 100, 25, region);
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
        System.out.println(nombreHeroe + " Defendio ! Vida restante:  " + vida);
        return vida;
    }
    
}
