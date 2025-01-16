package Day_13.main.java;

public class Array_sorting {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr);

        int[] arr1 = {};
        sort(arr1);

        int[] arr2 = { 2, 5, 7, 8, 9, 9, 3, 4 };
        sort(arr2);

        int[] arr3 = { 1, 2, 3, 4, 5 };
        sort(arr3);
    }
}
