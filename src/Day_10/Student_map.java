//Map:
//Create a program that uses a Map to store and manage student names and their corresponding grades.
// Implement the following features:
//Add a student's name and grade to the map.
//Update a student's grade if the student already exists in the map.
//Retrieve a student's grade by their name.
//Display all students and their grades.
//Input Example:
//Add: {"Alice": 85, "Bob": 90, "Charlie": 88}
//Update: {"Bob": 92}
//Retrieve: "Alice"

//Output Example:
//Alice's grade: 85
//All students and grades:
//Alice: 85
//Bob: 92
//Charlie: 88

package Day_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();
        System.out.println("Enter exit to stop :");
        System.out.println("Add:");

        while(true)
        {
            String name=sc.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            int grade=sc.nextInt();
            sc.nextLine();
            map.put(name,grade);
        }

      System.out.println("Enter name of student to update :");
      String updateName=sc.nextLine();
      if(map.containsKey(updateName))
      {
          System.out.println("Enter new grade :");
          int newGrade=sc.nextInt();
          map.put(updateName,newGrade);
      }



      System.out.println("Enter student name to retrive their grade :");
      sc.nextLine();
      String retriveName=sc.nextLine();
      int grade=map.get(retriveName);
      System.out.println(retriveName+" grade :"+grade);
      System.out.println("All students and their grades:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
