//Simulate a simple multithreaded task executor:
//Create a fixed-thread pool of size 5 using Executors.newFixedThreadPool(5).
//Submit 10 tasks (e.g., printing numbers from 1 to 10) and observe how tasks are distributed among threads.
//Use VisualVM to monitor the thread usage and performance.

package Day_19.Executors_VisualVM;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreaded_task_executor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

                for (int i = 1; i < 10; i++) {
                    int num=i;
                   executor.submit(()->
                    {
                        System.out.println(num+ " Task executed by "+Thread.currentThread().getName());
                        try
                        {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    });
                }
            }
        };

