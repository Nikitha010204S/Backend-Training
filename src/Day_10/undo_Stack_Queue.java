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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        System.out.println("Enter exit to stop: ");

        while (true) {
            String word = sc.nextLine();
            if (word.equals("exit"))
                break;
            if (word.equals("Undo") && !stack.isEmpty()) {
                String lastword = stack.pop();
               res.delete(res.lastIndexOf(lastword), res.length());
            } else {
                stack.push(word);
                res.append(word).append(" ");
            }
        }
        System.out.println(res.toString());
    }
}
