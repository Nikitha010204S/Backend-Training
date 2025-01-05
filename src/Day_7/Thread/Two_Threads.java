//Write a Java program to demonstrate the use of multithreading. The program should:
//Create two threads:
//Thread 1: Print numbers from 1 to 10 with a 500ms delay between each number.
//Thread 2: Print the square of numbers from 1 to 10 with a 700ms delay between each number.
//Ensure both threads run concurrently.
//Use Thread class or Runnable interface for thread implementation.

package Day_7.Thread;
import java.lang.Thread;

class Threads1 extends Thread{
    int start;
    int end;
    int delay;
    Threads1(int start, int end, int delay) {
        this.start = start;
        this.end = end;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = start; i <=end; i++) {
            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("i = "+ i);

        }
    }
}
class Threads2 extends Thread{
    int start;
    int end;
    int delay;

    Threads2(int start, int end, int delay) {
        this.start = start;
        this.end = end;
        this.delay = delay;
    }
    @Override
    public void run() {
        for (int i = start; i <=end; i++) {
            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Square of "+i+" = "+i*i);
        }
    }
}
class Two_Threads
{
    public static void main(String[] args)
    {
        Threads1 t1 = new Threads1(1,10,500);
        Threads2 t2 = new Threads2(1, 10, 700);
        t1.start();
        t2.start();
    }
}
