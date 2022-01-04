package entities;

public class Product_vector {
    private String name;
    private double price;


    public Product_vector(String name, double price) {
        this.price = price;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

}