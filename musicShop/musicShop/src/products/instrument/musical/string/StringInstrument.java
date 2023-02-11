package products.instrument.musical.string;

import products.instrument.musical.MusicalInstrument;

public abstract class StringInstrument extends MusicalInstrument {


    public StringInstrument(int id) {
        super(id);
    }

    public StringInstrument(int id, double cost) {
        super(id, cost);
    }

    public abstract int getStringAmount();
}
