//Create a mini-application combining these topics:
//Use a package utilities containing a generic class Container<T> to store any object.
//Use an enum Priority with values LOW, MEDIUM, and HIGH.
//Use a Main class to demonstrate autoboxing, access modifiers, and package imports.


package Day_5.Utilities;

public class Container<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public void display() {
        System.out.println("Item : "+item);
    }
}
