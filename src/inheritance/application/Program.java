package inheritance.application;

import inheritance.entities.Account;
import inheritance.entities.BusinessAccount;
import inheritance.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0.0, 500.00);


        // UPCAST - subclass object assigned to a superclass reference
        Account acc01 = bAcc;
        Account acc02 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc03 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCAST - superclass reference cast to a subclass reference
        BusinessAccount acc04 = (BusinessAccount) acc02;
        acc04.loan(100.0);

        // BusinessAccount acc05 = (BusinessAccount) acc03;
        if (acc03 instanceof BusinessAccount){
            BusinessAccount acc05 = (BusinessAccount) acc03;
            acc05.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc03 instanceof SavingsAccount) {
            SavingsAccount acc05 = (SavingsAccount) acc03;
            acc05.updateBalance();
            System.out.println("Update!");
        }
    }
}
