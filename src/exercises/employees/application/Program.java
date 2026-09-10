package exercises.employees.application;

import exercises.employees.entities.Employee;
import exercises.employees.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> emp = new ArrayList<Employee>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + " data:");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Outsourced? (Yes/No): ");
            char verifyEmployee = sc.next().toUpperCase().charAt(0);
            if (verifyEmployee == 'Y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                emp.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee e : emp) {
            System.out.printf("%s – $ %.2f \n", e.getName(), e.payment());
        }

        sc.close();
    }
}
