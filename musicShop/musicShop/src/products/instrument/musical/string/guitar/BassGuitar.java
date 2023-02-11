package products.instrument.musical.string.guitar;

public class BassGuitar extends Guitar {
    public BassGuitar(int id) {
        super(id);
    }

    public BassGuitar(int id, double cost) {
        super(id, cost);
    }

    @Override
    public int getStringAmount() {
        return 4;
    }
}
