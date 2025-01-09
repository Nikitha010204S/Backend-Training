//Stack and Queue
//Problem Statement for Stack: Undo Functionality
//Create a program that uses a Stack to implement an Undo feature for a text editor. The program should:
//Allow the user to perform actions like typing words (e.g., "Hello", "World").
//Store each action in the stack.
//Undo the last action by popping it from the stack.
//Input Example:
//Actions: "Type Hello", "Type World", "Undo", "Type Java".
//Output Example:
//Current Text: Hello Java

package Day_10;

import java.util.Scanner;
import java.util.Stack;

public class undo_Stack_Queue {
   
public class undo_Stack_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String currentText = "";

        String[] actions = {"Type Hello", "Type World", "Undo", "Type Java"};

        for (String action : actions) {
            if (action.startsWith("Type")) {
                String word = action.substring(5);
                stack.push(currentText);
                currentText += (currentText.isEmpty() ? "" : " ") + word;
            } else if (action.equals("Undo")) {
                if (!stack.isEmpty()) {
                    currentText = stack.pop();
                } else {
                    System.out.println("No actions to undo.");
                }
            }
        }
        System.out.println("Current Text: " + currentText);
    }
}

