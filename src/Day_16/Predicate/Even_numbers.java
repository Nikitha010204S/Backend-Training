//Filter Even Numbers
//Write a program to filter all even numbers from a list of integers using a Predicate. Use a higher-order
// function to perform the filtering.
//Input: [12, 45, 22, 35, 60]
//Output: [12, 22, 60]

package Day_16.Predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Even_numbers {
   public void printEven(int[] arr,IntPredicate predicate){
       for(int a:arr)
       {
           if(predicate.test(a))
           {
               System.out.print(a+" ");
           }
       }
   }
   public static void main(String[] args) {
       int[] arr={12,45,22,35,60};
       IntPredicate predicate = x->x%2==0;
       Even_numbers e = new Even_numbers();
       e.printEven(arr,predicate);

   }
}
