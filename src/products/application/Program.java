package products.application;

import products.entities.ImportedProduct;
import products.entities.Product;
import products.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("\nProduct #" + (i + 1) + " data:");
            System.out.print("Common, used or imported? (C/U/I): ");
            char typeOfProduct = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            switch (typeOfProduct) {
                case 'C':
                    products.add(new Product(name, price));
                    break;
                case 'U':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    products.add(new UsedProduct(name, price, date));
                    break;
                case 'I':
                    System.out.print("Customs fee: ");
                    Double customsFee = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
                    break;
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
