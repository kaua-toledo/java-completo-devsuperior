package staticmembers.application;


import staticmembers.application.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;


public class ProgramDollar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice, quantity;

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        quantity = sc.nextDouble();

        double t = CurrencyConverter.toBePaid(dollarPrice, quantity);

        System.out.printf("Amount to be paid: %.2f%n", t);

        sc.close();
    }
}
