//Write a program to add two 2D matrices.
package Day_3.Arrays;

import java.util.Scanner;

public class Add_2D_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :");
        int n = sc.nextInt();
        System.out.println("Enter columns :");
        int m = sc.nextInt();
        System.out.println("Enter matrix :");
        int sum = 0;
        int[][] matrix = new int[n][m];
        int[][] matrix1 = new int[n][m];
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix1 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = matrix[i][j] + matrix1[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
