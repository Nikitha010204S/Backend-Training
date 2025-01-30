package Day_21_22.Student_Management_System;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Studentt {
    private int ID;
    private String Name;
    private int Age;
    private Character Grade;
    private String Email;

    public Studentt(int ID, String name, int age, Character grade, String email) {
        this.ID = ID;
        Name = name;
        Age = age;
        Grade = grade;
        Email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public Character getGrade() {
        return Grade;
    }
    public void setGrade(Character grade) {
        Grade = grade;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String toString()
    {
        return "Id :"+ID+", Name :"+Name+", Age :"+Age+", Grade :"+Grade+", Email :"+Email;
    }

    //SAVE_AS_FILE
    public static void saveStudentToFile(List<Studentt> students) {
        try {
            File file = new File("Updated_students.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, false);
            writer.write("ID, Name, Age, Grade, Email\n");
            for (Studentt student : students) {
                writer.write(student.getID() + ", " + student.getName() + ", " + student.getAge() + ", "
                        + student.getGrade() + ", " + student.getEmail() + "\n");
            }
            writer.close();
            System.out.println("Data Saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    //LOAD_FILE
    public static List<Studentt> loadStudentsFromFile() {
    List<Studentt> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Updated_students.csv"))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] studentData = line.split(", ");
                if (studentData.length == 5) {
                    int id = Integer.parseInt(studentData[0]);
                    String name = studentData[1];
                    int age = Integer.parseInt(studentData[2]);
                    char grade = studentData[3].charAt(0);
                    String email = studentData[4];
                    students.add(new Studentt(id, name, age, grade, email));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return students;
    }

    }


class Main_Studentt {
    static List<Studentt> Student_list = new ArrayList<>();
    public static void main(String args[]) {

        Student_list = Studentt.loadStudentsFromFile();
        Scanner s = new Scanner(System.in);
        boolean exit = true;
        try {
            while (exit) {
                System.out.println("||-----------------------------||");
                System.out.println("||           MENU              ||");
                System.out.println("||-----------------------------||");
                System.out.println("||  1) Add new Student         ||");
                System.out.println("||  2) View all Students       ||");
                System.out.println("||  3) Search Student by ID    ||");
                System.out.println("||  4) Update Student details  ||");
                System.out.println("||  5) Delete Student details  ||");
                System.out.println("||  6) Sort by Age             ||");
                System.out.println("||  7) Filter by Grade         ||");
                System.out.println("||  8) Exit                    ||");
                System.out.println("||-----------------------------||");
                System.out.println();
                System.out.println("Enter your choice:");
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        Add_student(s);
                        break;
                    case 2:
                        View_all();
                        break;
                    case 3:
                        Search(s);
                        break;
                    case 4:
                        Update(s);
                        break;
                    case 5:
                        Delete(s);
                        break;
                    case 6:
                        Sorting(s);
                        break;
                    case 7:
                        Search_filter(s);
                        break;
                    case 8:
                        Exit();
                        System.out.println("Exiting...");
                    default:
                        System.out.println("Invalid choice.Please choose any choice...");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers where required.");
        }
    }

    //ADD STUDENT
    private static void Add_student(Scanner s) {
        int id = -1;
        while (id == -1) {
            System.out.println("Enter ID:");
            try {
                id = s.nextInt();
                s.nextLine();
                int finalId = id;
                if (Student_list.stream().anyMatch(st -> st.getID() == finalId)) {
                    System.out.println("ID already exists! Please enter a unique ID.");
                    id = -1;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid ID. Enter a valid ID");
                s.nextLine();
            }
        }
        System.out.println("Enter Name:");
      String name="";
        try {
             name= s.nextLine();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }
        } catch (Exception e) {
            System.out.println("Exception:"+e.getMessage());
        }


        int age=-1;
        while(age<0) {
            System.out.println("Enter Age:");
            try {
                age = s.nextInt();
                s.nextLine();
                if (age < 0) {
                    System.out.println("You are allowed to enter negative values");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid age. Enter a valid integer");
            }
        }

        System.out.println("Enter Grade:");
        Character grade= s.next().charAt(0);
        s.nextLine();

        boolean validEmail = false;
        while (!validEmail) {
            System.out.println("Enter Mail:");
            String mail = s.nextLine();
            if (isvalid_mail(mail)) {
                validEmail = true;
                Studentt st = new Studentt(id, name, age, grade, mail);
                Student_list.add(st);
                Studentt.saveStudentToFile(Student_list);
                System.out.println("Student added successfully...");
                System.out.println();
            } else {
                System.out.println("Invalid Email");
            }
        }
    }

    //VIEW ALL
    private static void View_all() {
        System.out.println("Details of All Students:");
        Student_list.stream().sorted(Comparator.comparing(Studentt::getID))
                .forEach(System.out::println);
        System.out.println();
    }

    //SEARCH
    private static void Search(Scanner s) {
        System.out.println("Please Enter ID to search the student details:");
        int search_id=s.nextInt();
        Optional<Studentt> student=Student_list.stream().filter(st->st.getID()==search_id).findFirst();
        student.ifPresentOrElse(st -> System.out.println("Student found: " + st),
                () -> System.out.println("No student found with ID: " + search_id));
    }

    //UPDATE
    private static void Update(Scanner s) {
        System.out.println("Enter the Student ID you want to update:");
        int update_id = s.nextInt();
        s.nextLine();
        Optional<Studentt> studentToUpdate = Student_list.stream()
                .filter(st -> st.getID() == update_id)
                .findFirst();

        studentToUpdate.ifPresentOrElse(student -> {
            System.out.println("Which detail would you like to update?");
            System.out.println("1) Name");
            System.out.println("2) Age");
            System.out.println("3) Grade");
            System.out.println("4) Email");
            System.out.print("Enter choice: ");
            int update_choice = s.nextInt();
            s.nextLine();

            switch (update_choice) {
                case 1:
                    System.out.print("Enter new Name: ");
                    student.setName(s.nextLine());
                    System.out.println("Name updated successfully.");
                    break;
                case 2:
                    System.out.print("Enter new Age: ");
                    student.setAge(s.nextInt());
                    s.nextLine();
                    System.out.println("Age updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter new Grade: ");
                    student.setGrade(s.next().charAt(0));
                    s.nextLine();
                    System.out.println("Grade updated successfully.");
                    break;
                case 4:
                    System.out.print("Enter new Email: ");
                    String new_email = s.nextLine();
                    if (isvalid_mail(new_email)) {
                        student.setEmail(new_email);
                        System.out.println("Email updated successfully.");
                    } else {
                        System.out.println("Invalid email.");
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            Studentt.saveStudentToFile(Student_list);
        }, () -> System.out.println("No student found with ID: " + update_id));
    }


    //DELETE
    private static void Delete(Scanner s) {
        System.out.println("Please Enter ID to delete the student details:");
        int delete_id=s.nextInt();
        Optional<Studentt> studentToDelete = Student_list.stream()
                .filter(st -> st.getID() == delete_id)
                .findFirst();
        studentToDelete.ifPresentOrElse(student ->
        {
            Student_list.remove(student);
            Studentt.saveStudentToFile(Student_list);
            System.out.println("Student with ID " + delete_id + " has been deleted successfully.");
        }, () -> System.out.println("No student found with ID: " + delete_id));
    }

    //SORT BY AGE

    private static void Sorting(Scanner s) {
        boolean sorting=true;
        while(sorting) {
            System.out.println("1) Sort by name");
            System.out.println("2) Sort by age");
            System.out.println("3) Go back");
            System.out.println("Enter your choice:");

            int sort_choice = s.nextInt();
            switch (sort_choice)
            {
                case 1:
                    System.out.println("Details of All Students (sort by name):");
                    Student_list.stream().sorted(Comparator.comparing(Studentt::getName))
                            .forEach(System.out::println);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Details of All Students (sort by age):");
                    Student_list.stream().sorted(Comparator.comparing(Studentt::getAge))
                            .forEach(System.out::println);
                    System.out.println();
                    break;
                case 3:
                    sorting = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");

            }
        }

    }

    //FILTER BY GRADE
    private static void Search_filter(Scanner s) {
        System.out.print("Enter Grade to filter: ");
        char grade = s.next().charAt(0);
        s.nextLine();

        List<Studentt> filteredStudents = Student_list.stream()
                .filter(st -> st.getGrade() == grade)
                .toList();

        if (filteredStudents.isEmpty()) {
            System.out.println("No students found with Grade: " + grade);
        } else {
            filteredStudents.forEach(System.out::println);
        }
    }

    //EXIT
    private static void Exit() {
        System.out.println("Exiting Student Management System...");
        System.exit(0);
    }

    //MAIL CHECK-REGEX
    public static boolean isvalid_mail(String mail)
    {
        String exp="^[a-zA-Z0-9][a-zA-Z0-9.-_]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
        Pattern pattern = Pattern.compile(exp);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }


}

