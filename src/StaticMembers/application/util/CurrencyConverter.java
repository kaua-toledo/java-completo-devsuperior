package StaticMembers.application.util;

public class CurrencyConverter {

    public static double toBePaid(double dollarPrice, double quantity) {
        return (dollarPrice + 6.0 * dollarPrice / 100) * quantity;
    }
}
