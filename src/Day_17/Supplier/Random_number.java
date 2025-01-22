//Random Supplier Create a Supplier that generates a random number between 1 and 100 and prints it 5 times.

package Day_17.Supplier;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Random_number {
    public static void main(String[] args) {
        IntSupplier random_number = () -> new Random().nextInt(100)+1;
        for (int i = 0; i < 5; i++) {
            System.out.println(random_number.getAsInt());
        }
    }
}

