package Day_2.Program_control;

import java.util.Scanner;

public class End_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
            {
                break;
            }
            System.out.print(arr[i]+" ");
        }


    }
}
