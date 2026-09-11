package abstract_methods.application;

import abstract_methods.entities.Circle;
import abstract_methods.entities.Rectangle;
import abstract_methods.entities.Shape;
import abstract_methods.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("\nShape #" + (i + 1) + " data:");
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            System.out.print("Rectangle or Circle? (R/C): ");
            char chooseShape = sc.next().toUpperCase().charAt(0);
            if (chooseShape == 'R') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            } else if (chooseShape == 'C') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPE AREAS: ");
        for (Shape areas : shapes) {
            System.out.printf("%.2f \n", areas.area());
        }


        sc.close();
    }
}
