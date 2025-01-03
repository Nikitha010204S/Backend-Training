//Create a program that demonstrates:
//Creating an object of a class.
//Using the basic methods of the Object class: getClass() and toString().

package Day_6.Java_Lang_obj;

public class Demo {
    @Override
    public String toString() {
       return "Here we override the toString() method";
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.getClass());
        System.out.println(demo.toString());
    }

}