package products.instrument.musical.string;

public class Dombyra extends StringInstrument {

    public Dombyra(int id) {
        super(id);
    }

    public Dombyra(int id, double cost) {
        super(id, cost);
    }

    @Override
    public int getStringAmount() {
        return 2;
    }
}

