package TFP;

public class HeroeDefensa extends Personaje {
    
    public HeroeDefensa(String nombre, Region region) {
        super(nombre, 40, 2, 10, region);
    }


    @Override
    public int atacar() {
        System.out.println(nombre + " savunma pozisyonunda! Hasar: " + ataque);
        return ataque;
    }

    @Override
    public int defender(int dano) {
        int recibido = dano - defensa;
        if (recibido > 0) {
            vida -= recibido;
        }
        System.out.println(nombre + " savundu! Kalan can: " + vida);
        return vida;
    }
}
