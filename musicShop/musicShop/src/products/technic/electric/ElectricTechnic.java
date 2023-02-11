package products.technic.electric;

import products.Product;

public abstract class ElectricTechnic extends Product {

    public ElectricTechnic(int id) {
        super(id);
    }

    public ElectricTechnic(int id, double cost) {
        super(id, cost);
    }
}

