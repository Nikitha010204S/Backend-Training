//Create two interfaces Printer with a method print() and Scanner with a method scan().
// Create a class AllInOne that implements both interfaces.
package Day_3.Interface_2;

interface Printer {
    void print();
}
interface Scanner {
    void scan();
}

class AllInOne implements Printer, Scanner
{
@Override
    public void print() {
    System.out.println("Printing All In One");
}
@Override
    public void scan() {
    System.out.println("Scanning All In One");
}
}
class Main7{
    public static void main(String[] args) {
        AllInOne a = new AllInOne();
        a.print();
        a.scan();
    }
}
