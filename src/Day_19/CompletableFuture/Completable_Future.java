//Exercise:
//Write a program using CompletableFuture to simulate the following tasks:
//Task 1: Fetch user data (simulate with a Thread.sleep()).
//Task 2: Fetch user orders (simulate with a Thread.sleep()).
//Combine the results of both tasks and print the user details along with the orders.
//Use thenCombine() to merge the results from both tasks.

package Day_19.CompletableFuture;

import java.util.concurrent.CompletableFuture;

import static java.lang.Thread.sleep;

public class Completable_Future
{
    public static void main(String[] args)
    {
        CompletableFuture task1=CompletableFuture.supplyAsync(()->
        {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Nikitha";
        });

        CompletableFuture task2=CompletableFuture.supplyAsync(()->
        {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 120;
        });

        CompletableFuture Total=task1.thenCombine(task2,(res1,res2)->
        {
            return res1+" "+res2;
        });

        System.out.println(Total.join());

    }

}
