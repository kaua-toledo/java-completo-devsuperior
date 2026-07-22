package triangle.application;

import triangle.application.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        System.out.print("A: ");
        x.a = sc.nextDouble();
        System.out.print("B: ");
        x.b = sc.nextDouble();
        System.out.print("C: ");
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        System.out.print("A: ");
        y.a = sc.nextDouble();
        System.out.print("B: ");
        y.b = sc.nextDouble();
        System.out.print("C: ");
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
