package products.technic.electric.microphone;

import products.technic.electric.ElectricTechnic;

public abstract class Microphone extends ElectricTechnic {


    public Microphone(int id) {
        super(id);
    }

    public Microphone(int id, double cost) {
        super(id, cost);
    }
}
