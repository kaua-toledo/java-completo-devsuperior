package exercises.tax_payers.application;

import exercises.tax_payers.entities.Company;
import exercises.tax_payers.entities.Individual;
import exercises.tax_payers.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();

        String name;
        Double annualIncome;
        Double healthExpenditures;
        Integer numberOfEmployees;

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        for (int i = 0; i < N; i++) {
            System.out.println("\nTax Payer #" + (i + 1) + " data:");
            System.out.print("Individual or Company? (I/C): ");
            char typeOfTaxPayer = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            switch (typeOfTaxPayer) {
                case 'i':
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Annual income: ");
                    annualIncome = sc.nextDouble();
                    System.out.print("Health expenditures: ");
                    healthExpenditures = sc.nextDouble();
                    list.add(new Individual(name, annualIncome, healthExpenditures));
                    break;
                case 'c':
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Annual income: ");
                    annualIncome = sc.nextDouble();
                    System.out.print("Number of employees: ");
                    numberOfEmployees = sc.nextInt();
                    list.add(new Company(name, annualIncome, numberOfEmployees));
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        System.out.println("\nTAXES PAID:");
        for (TaxPayer tp : list) {
            System.out.printf("%s: $%.2f \n", tp.getName(), tp.tax());
        }

        double sumTaxes = 0;
        for (TaxPayer tp1 : list) {
            sumTaxes += tp1.tax();
        }
        System.out.printf("\nTOTAL TAXES: $%.2f\n", sumTaxes);

        sc.close();
    }
}