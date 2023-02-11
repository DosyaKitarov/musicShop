package products.instrument;

import products.Product;

public abstract class Instrument extends Product {

    public Instrument(int id) {
        super(id);
    }

    public Instrument(int id, double cost) {
        super(id, cost);
    }
}
