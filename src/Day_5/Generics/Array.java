//Write a generic method printArray(T[] array) to print elements of any array type.
// Test it with arrays of String, Integer, and Double.

package Day_5.Generics;

public class Array {
    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,3,5,8,9,0};
        System.out.println("Integer Array :");
        printArray(intArray);

        Double[] doubleArray = {1.0,2.0,3.0,4.0,5.0};
        System.out.println("Double Array :");
        printArray(doubleArray);

        String[] stringArray = {"East","West","North","South"};
        System.out.println("String Array :");
        printArray(stringArray);
    }
}
