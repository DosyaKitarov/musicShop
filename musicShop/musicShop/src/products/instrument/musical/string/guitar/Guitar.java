package products.instrument.musical.string.guitar;

import products.instrument.musical.string.StringInstrument;

public abstract class Guitar extends StringInstrument {
    public Guitar(int id) {
        super(id);
    }

    public Guitar(int id, double cost) {
        super(id, cost);
    }


}
