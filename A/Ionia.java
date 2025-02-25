package TFP;

public class Ionia extends Region {
    public Ionia() {
        super("Ionia");
    }

    @Override
    public int bonusVida() {
        return 100;
    }

    @Override
    public int bonusAtaque() {
        return 50;
    }

    @Override
    public int bonusDefensa() {
        return 25;
    }
}