package list.application;

import list.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int employeesToRegister = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < employeesToRegister; i++) {
            System.out.println("\nEmployee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("\nEnter the basics.employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Employee empId = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        //Integer pos = position(list, idSalary);


        if (empId == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            empId.increaseSalary(percentage);

            //list.get(pos).increaseSalary(percentage);
        }

        System.out.println("\nList of Employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    static Boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
