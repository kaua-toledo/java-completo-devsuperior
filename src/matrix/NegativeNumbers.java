package matrix;

import java.util.Scanner;

public class NegativeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, negativeCount = 0;


        System.out.print("Enter the matrix size: ");
        n = sc.nextInt();

        int[][] mat = new int[n][n];


        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nMain diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0)
                    negativeCount++;
            }
        }
        System.out.println("\nNegative numbers = " + negativeCount);

        sc.close();
    }
}
