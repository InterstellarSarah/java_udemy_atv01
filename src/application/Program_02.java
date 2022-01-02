package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products product = new Products();
        System.out.println("Enter the product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        product.toString();

        System.out.println();
        /*System.out.println("Product data: " + product.name + ", " + product.price + ", " + product.quantity + ".");
          System.out.println(product.toString());
         */
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt(); // declarada aqui uma variavel que deve se diferenciar ao metodo de classe
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updade data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updade data: " + product);

        sc.close();
    }
}
