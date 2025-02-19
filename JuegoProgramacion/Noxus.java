package TFP;

public class Noxus extends Region {
    public Noxus() {
        super("Noxus");
    }

    @Override
    public int bonusVida() {
        return 50;
    }

    @Override
    public int bonusAtaque() {
        return 100;
    }

    @Override
    public int bonusDefensa() {
        return 25;
    }
}