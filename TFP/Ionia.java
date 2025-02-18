package TFP;

public class Ionia extends Region {
    public Ionia() {
        super("Ionia");
    }

    @Override
    public int bonusVida() {
        return 60;
    }

    @Override
    public int bonusAtaque() {
        return 5;
    }

    @Override
    public int bonusDefensa() {
        return 20;
    }
}