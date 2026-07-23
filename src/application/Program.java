package application;

import application.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accHolder = sc.nextLine();
        System.out.println("Is there an initial deposit?");
        System.out.print("(y/n): ");
        char response = sc.nextLine().charAt(0);
        if (response == 'y' || response == 'Y') {
            System.out.print("Enter a deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accNumber, accHolder, initialDeposit);
        } else {
            account = new Account(accNumber, accHolder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);

        System.out.println("Updated Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("Updated Account data:");
        System.out.println(account);

        sc.close();
    }
}
