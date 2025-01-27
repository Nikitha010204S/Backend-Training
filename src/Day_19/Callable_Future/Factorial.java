//Write a program to calculate the factorial of a number using Callable and Future.
//Create a FactorialTask class that implements Callable<Long>.
//Use an ExecutorService to submit the task.
//Retrieve the result using the Future.get() method.

package Day_19.Callable_Future;

import java.util.concurrent.*;

public class Factorial implements Callable<Long> {
  private final int n;
   public Factorial(int n) {
    this.n = n;
   }
   @Override
    public Long call() throws Exception {
       long fact = 1;
       for (int i = 1; i <= n; i++) {
           fact *= i;
       }
       return fact;
   }

   public static void main(String[] args) {
      int num=4;
       ExecutorService executor = Executors.newFixedThreadPool(1);
       Callable<Long> callable=new Factorial(num);
       Future<Long> future = executor.submit(callable);
       try
       {
           System.out.println("Factorial of "+num+" is : "+future.get());
       } catch (RuntimeException e) {
           throw new RuntimeException(e);
       } catch (ExecutionException e) {
           throw new RuntimeException(e);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
}