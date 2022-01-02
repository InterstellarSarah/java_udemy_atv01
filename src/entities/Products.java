package entities;


public class Products {
    public String name;
    public double price;
    public int quantity; //atributos

    public double totalValueInStock(){
       return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity; //this é para referenciar os atributos de classe, e nao qualquer variavel dentro deste metodo
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price) //para aparecer o preço com duas casas decimais apos a virgula (equi. centavos)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock()); //aparecer cemntavos tbm
    }
}
