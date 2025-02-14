package TFP;

public class Noxus extends Region {
    public Noxus() {
        super("Noxus");
    }

    @Override
    public int bonusVida() {
        return 30;
    }

    @Override
    public int bonusAtaque() {
        return 25;
    }

    @Override
    public int bonusDefensa() {
        return 15;
    }
}