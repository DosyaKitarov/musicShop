package products.instrument.musical;

import products.instrument.Instrument;

public abstract class MusicalInstrument extends Instrument {

    public MusicalInstrument(int id) {
        super(id);
    }

    public MusicalInstrument(int id, double cost) {
        super(id, cost);
    }
}
