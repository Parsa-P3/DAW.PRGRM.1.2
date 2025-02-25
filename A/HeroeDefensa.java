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


	@Override
	public int curar(Personaje Personaje1 , Personaje Personaje2){
		System.out.println("");
		System.out.println("Currando " + Personaje2.nombreHeroe +  ". Vida actual :" +Personaje2.getVida());
		System.out.println("+" + Personaje1.getDefensa());
		int heal = Personaje2.getVida() + Personaje1.getDefensa();
		Personaje2.vida = heal;
		System.out.println("Vida actualizada :" + Personaje2.getVida());
		System.out.println("");
		return Personaje2.vida;
		
	}
}
