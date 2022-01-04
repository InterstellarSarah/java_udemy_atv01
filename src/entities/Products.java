package entities;


public class Products {
    private String name;
    private double price;
    private int quantity;
    //encapsulamento

    public Products(String name, double price, int quantity){
        this.name = name; //this atribui o objeto "name" apenas é o parametro do metodo
        this.price = price;
        this.quantity = quantity;
    }

    public Products(String name, double price) { //sobrecarga do metodo acima
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
        //para poder chamar no programa o metodo encapsulado
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
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
