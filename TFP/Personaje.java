package TFP;

public abstract class Personaje {
    protected String nombreHeroe;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected Region region;

    public Personaje( String nombre, int vida, int ataque, int defensa, Region region) {
   
        this.nombreHeroe = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.region = region;
        aplicarBonusRegion();

    }
    
    private void aplicarBonusRegion() {
        this.vida += region.bonusVida();
        this.ataque += region.bonusAtaque();
        this.defensa += region.bonusDefensa();
    }

    public void setVida(int ataque) {
		this.vida = vida - ataque;
		   if((this.vida) < 0) {
			   this.vida=0;
		   }
	}

	public abstract void atacar();
    public abstract int defender(int dano);

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNombre() {
        return nombreHeroe;
    }

 
	public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return nombreHeroe + " con "+ vida + " HP , Ataque: " + ataque + ", Defensa: " + defensa  +  ". Su region : " + region.getNombre();
    }
  
    


	
}
