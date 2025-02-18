package TFP;
public abstract class Region {
    protected String nombre;

    public Region(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int bonusVida();
    public abstract int bonusAtaque();
    public abstract int bonusDefensa();
}