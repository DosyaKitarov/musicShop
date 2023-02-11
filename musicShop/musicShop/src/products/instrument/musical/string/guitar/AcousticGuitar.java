package products.instrument.musical.string.guitar;

public class AcousticGuitar extends Guitar {
    public AcousticGuitar(int id) {
        super(id);
    }

    public AcousticGuitar(int id, double cost) {
        super(id, cost);
    }

    @Override
    public int getStringAmount() {
        return 6;
    }
}
