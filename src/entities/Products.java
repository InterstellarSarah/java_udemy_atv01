package entities;


public class Products {
    public String name;
    public double price;
    public int quantity;

    public Products(String name, double price, int quantity){
        this.name = name; //this atribui o objeto "name" apenas é o parametro do metodo
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
