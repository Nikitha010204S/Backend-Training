//Object and method locking
//Write a Java program to demonstrate object-level and method-level locking using multithreading. The program should:
//Create a shared resource class (e.g., SharedPrinter) with two synchronized methods:
//Method 1: Print a given string multiple times.
//Method 2: Print a countdown from a given number.
//Use two threads:
//Thread 1: Calls the first synchronized method (print string).
//Thread 2: Calls the second synchronized method (countdown).
//Demonstrate the difference between:
//Object-Level Locking: When both threads use the same instance of the shared resource.
//Class-Level Locking: When both threads use a static synchronized method or block.
//Show how the locks affect the execution order of the methods.


package Day_7.Object_and_method_locking;

public class SharedPrinter {
    //Obj level locking
    public synchronized void printString(String str, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("String " + i + " = " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void Countdown(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println("Countdown = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //Class level locking
    public static synchronized void printStringCls(String str, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("String " + i + " = " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static synchronized void CountdownCls(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println("Countdown = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread1 extends Thread {
    private SharedPrinter printer;

    public Thread1(SharedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printString("This is Thread 1", 10);
    }
}

class Thread2 extends Thread {
    private SharedPrinter printer;

    public Thread2(SharedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.Countdown(10);
    }
}

class Thread3 extends Thread {
    private SharedPrinter printer;

    public Thread3(SharedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printStringCls("This is Thread 2 ",10);
    }
}

class Thread4 extends Thread {
    private SharedPrinter printer;

    public Thread4(SharedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.CountdownCls(10);
    }



    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();
        System.out.println("Object level locking...");

        Thread1 t1 = new Thread1(printer);
        Thread2 t2 = new Thread2(printer);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Class level locking...");
        Thread3 t3 = new Thread3(printer);
        Thread4 t4 = new Thread4(printer);
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
