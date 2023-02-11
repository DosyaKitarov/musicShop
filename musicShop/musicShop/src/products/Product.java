package products;

public class Product {
    protected final int id;
    protected String name;
    protected double price;

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Price: " + price +"\n";
    }

}
