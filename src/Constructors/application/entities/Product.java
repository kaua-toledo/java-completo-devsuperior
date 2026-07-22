package Constructors.application.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    /**
     * Parameterized Constructor
     * Initializes a new Product instance with explicit values
     *
     * @param name     The name of the product
     * @param price    The unit price of the product
     * @param quantity The initial quantity in stock
     */
    public Product(String name, double price, int quantity) {
        // 'this' distinguishes the class fields from the local parameter
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // // Overloaded constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " Units, "
                + "Total: "
                + String.format("%.2f", totalValueInStock());
    }
}
