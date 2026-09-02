package memory_and_lists.arrays.application;

import memory_and_lists.arrays.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Rent[] vector = new Rent[10];

        for (int i = 1; i <= n; i++) {
            System.out.println("\nRent #" + i);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            vector[roomNumber] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                System.out.println("Room " + i + ": " + vector[i]);
            }
        }

        sc.close();
    }
}
