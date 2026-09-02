package encapsulation.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    /**
     * Creates a Product object with the specified name, price and quantity.
     *
     * @param name     basics.product name
     * @param price    basics.product unit price
     * @param quantity initial stock quantity
     */
    public Product(String name, double price, int quantity) {
        // 'this' distinguishes the class fields from the local parameter
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Overloaded constructor with default quantity
    public Product(String name, double price) {
        this(name, price, 0);
    }

    // Getters and setters provide controlled access to private attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
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

    @Override
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " Units, "
                + "Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}

