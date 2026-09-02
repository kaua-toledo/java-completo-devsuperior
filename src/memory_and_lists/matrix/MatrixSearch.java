package memory_and_lists.matrix;

import java.util.Scanner;

public class MatrixSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m, n, x;

        System.out.print("Enter the number of rows: ");
        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("\nEnter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nEnter the number to search for: ");
        x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position: [" + i + ", " + j + "]");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (j < n - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (i < m - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
            System.out.println();
        }


        sc.close();
    }
}
