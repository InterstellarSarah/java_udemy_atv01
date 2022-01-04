package application;

import entities.Product_vector;

import java.util.Locale;
import java.util.Scanner;

public class Program_vector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product_vector[] vect = new Product_vector[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product_vector(name, price);
        }
        double sum = 0.0;
        for (int i=0; i< vect.length; i++){
           sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("AVERAGE HEIGHT: %.2f%n " + avg);

        sc.close();
    }
}
