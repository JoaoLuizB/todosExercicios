package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductAula;

public class Program3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProductAula p = new ProductAula();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        ProductAula product = new ProductAula(name, price);



        System.out.println("Update name: " );
        System.out.println("Update price: " );

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();



        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();

        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}