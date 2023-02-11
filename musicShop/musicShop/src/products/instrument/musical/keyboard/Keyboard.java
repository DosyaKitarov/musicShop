package products.instrument.musical.keyboard;

import products.instrument.Instrument;

public abstract class Keyboard extends Instrument {

    public Keyboard(int id) {
        super(id);
    }

    public Keyboard(int id, double cost) {
        super(id, cost);
    }

    public abstract int getKeyAmount();
}
