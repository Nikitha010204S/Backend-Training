//Create a program that allows the user to manage a task list using a LinkedList. Implement the following features:
//Add a task to the end of the list.
//Remove a task from the list by its name.
//Display all tasks in the list in the order they were added.
//
//Input Example:
//Add tasks: "Finish homework", "Go for a run", "Prepare dinner".
//Remove task: "Go for a run".
//Output Example:
//Task List:
//1. Finish homework
//2. Prepare dinner


package Day_10;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("Add tasks :");
            String task = sc.nextLine();
            if(task.equals("")) {
                break;
            }
            else{
                list.add(task);
            }
        }

        list.removeFirstOccurrence("Go for a run");
        System.out.println("Task List :");
        for(String s : list) {
            System.out.println(s);
        }

    }


}


