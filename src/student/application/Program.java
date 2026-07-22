package student.application;

import student.application.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student pupil = new Student();

        System.out.print("Enter student name: ");
        pupil.name = sc.nextLine();
        System.out.print("Enter grade for Trimester 1: ");
        pupil.grade1 = sc.nextDouble();
        System.out.print("Enter grade for Trimester 2: ");
        pupil.grade2 = sc.nextDouble();
        System.out.print("Enter grade for Trimester 3: ");
        pupil.grade3 = sc.nextDouble();

        System.out.println();
        System.out.printf("Final grade: %.2f%n", pupil.finalGrade());

        if (pupil.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", pupil.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
