//System - Print a message to the console and measure the execution time of a
// simple loop using System.currentTimeMillis().
package Day_6.Java_lang_Classes;

public class Execution_time {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int sum = 0;
        int n = 100000;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " milliseconds");


    }
}
