//Generics:
//Create a Generic Box class that can hold a single object of any type. The class should:
//Be able to store any type of object, whether it's a String, Integer, Double, or any custom class.
//Provide methods to:
//setItem(T item): Store an item in the box.
//getItem(): Retrieve the stored item.
//printItem(): Print the item stored in the box.
//Implement a method to check if the stored item is of a specific type, for example, using instanceof.
//
//Requirements:
//The Box class should be generic to store any type of object.
//The class should support methods to set, get, and print the item.
//Implement a type check (isTypeOf) that returns true if the item is of a specified type.

package Day_11;

public class Generics_Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem() {
        System.out.println(item);
    }

    public boolean isTypeOf(Object item) {
        return item instanceof String;
    }

    public static void main(String[] args) {
        Generics_Box<String> stringBox = new Generics_Box<>();
        stringBox.setItem("Hello");
        System.out.println("Is the item of type String? " + stringBox.isTypeOf(stringBox.getItem()));
        System.out.println("Is the item of type Integer? " + stringBox.isTypeOf(new Integer(42)));
    }
}
