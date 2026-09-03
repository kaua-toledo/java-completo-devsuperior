package inheritance.application;

import inheritance.entities.Account;
import inheritance.entities.BusinessAccount;
import inheritance.entities.SavingsAccount;

public class Program2 {

    public void main(String[] args) {

        // Testing override methods
        Account acc06 = new SavingsAccount(5592, "Toledo", 1000.0, 500.0);
        acc06.withdraw(250);
        System.out.println(acc06.getBalance());

        Account acc07 = new BusinessAccount(1707, "West", 1000.0, 500.0);
        acc07.withdraw(200.0);
        System.out.println(acc07.getBalance());

    }
}
