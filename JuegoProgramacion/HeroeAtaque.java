package TFP;

public class HeroeAtaque extends Personaje{

    public HeroeAtaque(String nombre, Region region) {
        super(nombre, 25, 10, 2, region);
    }

    @Override
    public int atacar() {
        System.out.println(nombre + " saldırıya geçti! Hasar: " + ataque);
        return ataque;
    }

    @Override
    public int defender(int dano) {
        int recibido = dano - defensa;
        if (recibido > 0) {
            vida -= recibido;
        }
        System.out.println(nombre + " kendini savundu! Kalan can: " + vida);
        return vida;
    }
    
}
