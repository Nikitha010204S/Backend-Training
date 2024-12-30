//Create a program to transpose a given matrix.
package Day_3.Arrays;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :");
        int n = sc.nextInt();
        System.out.println("Enter columns :");
        int m = sc.nextInt();
        System.out.println("Enter matrix :");
        int[][] matrix = new int[n][m];
        int[][] transpose = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
        transpose[j][i] = matrix[i][j];
        }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
