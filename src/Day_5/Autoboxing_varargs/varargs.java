//Create a method sum(int... numbers) that takes a variable number of integers as input
// and returns their sum. Test it with different numbers of arguments.

package Day_5.Autoboxing_varargs;

public class varargs {

        public static int sum(int... numbers) {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            return sum;
        }
        public static void main(String[] args) {
            varargs varargs = new varargs();
            System.out.println("Sum of 1 args : "+varargs.sum(5));
            System.out.println("Sum of 2 args : "+varargs.sum(5,7));
            System.out.println("Sum of 3 args : "+varargs.sum(5,3,56));

        }
}


