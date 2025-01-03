package Day_5;
import Day_5.Utilities.Container;
import Day_5.Utilities.priority;

public class Main9 {
    public static void main(String[] args) {
      Container<Integer> integerContainer = new Container<>();
      integerContainer.setItem(20);
      integerContainer.display();

        Container<String> stringContainer = new Container<>();
        stringContainer.setItem("Hello");
        stringContainer.display();

        Container<priority> priorityContainer = new Container<>();
        System.out.println("Task Priority: ");
        priorityContainer.setItem(priority.HIGH);

        stringContainer.setItem("Updated String Value");
        System.out.println("Updated String in Container: ");
        stringContainer.display();
    }
}
