package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int quantity;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        //System.out.print("Quantity in stock: ");
        //quantity = sc.nextInt();
        Products p = new Products(name, price);

        p.setName("Computer"); //teste encapsulamento
        System.out.println("Update data: " + p.getName());
        p.setPrice(1200);
        System.out.println("Update data: " + p.getPrice());

        System.out.println();
        System.out.println("Product data: " + p);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");

        quantity = sc.nextInt();
        p.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + p);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        p.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + p);

        sc.close();
    }
}
