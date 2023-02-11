package products.technic.electric.headphones;

import products.technic.electric.ElectricTechnic;

public abstract class Headphone extends ElectricTechnic {

    public Headphone(int id) {
        super(id);
    }

    public Headphone(int id, double cost) {
        super(id, cost);
    }
}
