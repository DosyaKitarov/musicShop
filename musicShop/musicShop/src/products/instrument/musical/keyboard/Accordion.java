package products.instrument.musical.keyboard;

public class Accordion extends Keyboard {
    public Accordion(int id) {
        super(id);
    }

    public Accordion(int id, double cost) {
        super(id, cost);
    }

    @Override
    public int getKeyAmount() {
        return 96;
    }
}
