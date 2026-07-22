package constructors.application.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    /**
     * Creates a Product object with the specified name, price and quantity.
     *
     * @param name     product name
     * @param price    product unit price
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
