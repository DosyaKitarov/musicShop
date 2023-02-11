package products.instrument.musical.keyboard;

public class Piano extends Keyboard {

    public Piano(int id) {
        super(id);
    }

    public Piano(int id, double cost) {
        super(id, cost);
    }

    @Override
    public int getKeyAmount() {
        return 88;
    }
}
