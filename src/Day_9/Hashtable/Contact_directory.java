//Contact Directory Management System
//Create a program to manage a contact directory using a Hashtable in Java. Implement the following functionalities:
//Add contacts with the name as the key and phone number as the value.
//Search for a contact by name and display their phone number.
//Remove a contact by name.
//Display all contacts in the directory.
//Input Example:
//Add contacts: John -> 9876543210, Alice -> 9123456780, Bob -> 8899776655.
//Search for Alice.
//Remove contact Bob.

//Output Example:
//Contact Directory:
//John: 9876543210
//Alice: 9123456780
//Search Result for Alice: 9123456780
//After Removal:
//John: 9876543210
//Alice: 9123456780

package Day_9.Hashtable;

import java.util.Hashtable;


public class Contact_directory {
    public static void main(String[] args) {
        Hashtable<String,Long> h = new Hashtable<String,Long>();
        h.put("John",9876543210L);
        h.put("Alice",9123456780L);
        h.put("Bob", 8899776655L);
        System.out.println("Contact directory:");
        for (String key : h.keySet()) {
            Long phoneNumber = h.get(key);
            System.out.println(key + ": " + phoneNumber);
        }
        System.out.println();
        long alice=h.get("Alice");
        System.out.println("Search Result for Alice: " + alice);
        System.out.println();
        h.remove("Bob");
        System.out.println("After removed :");
        for (String key : h.keySet()) {
            Long phoneNumber = h.get(key);
            System.out.println(key + ": " + phoneNumber);
        }
    }
}
