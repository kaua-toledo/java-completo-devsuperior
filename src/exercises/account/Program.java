package exercises.account;

import exercises.account.exceptions.BusinessException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Inicial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdraw = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdraw);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.printf("New balance: $%.2f%n", acc.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input error.");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }
    }
}
