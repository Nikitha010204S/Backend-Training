
# 📚 Student Management System

## Description
The Student Management System is a simple console-based Java application that allows users to manage student data. It supports CRUD (Create, Read, Update, Delete) operations, along with sorting and filtering functionalities. The data is saved in a CSV file for persistence and is loaded whenever the program starts.

## 📝 Features
- **➕ Add New Student**: Add a new student with ID, name, age, grade, and email.
- **👀 View All Students**: Display all student records.
- **🔍 Search Student by ID**: Find a student by their unique ID.
- **✏️ Update Student Details**: Modify student details such as name, age, grade, and email.
- **❌ Delete Student**: Remove a student record based on the provided ID.
- **🔀 Sort Students**: Sort students by name or age.
- **🔎 Filter Students by Grade**: Filter students based on their grade.
- **💾 Persistent Data Storage**: Data is stored in a CSV file (Updated_students.csv) for persistence.

## 📂 File Structure
```
Student_Management_System/
│   
├── Day_21_22/
│   └── Student_Management_System/
│       ├── Studentt.java             
│       └── Main_Studentt.java      
│
├── Updated_students.csv             
└── README.md                        
```

## 🛠 How to Use
Once the program is running, you'll be presented with a menu of options:

1. **➕ Add New Student**: Enter the student’s unique ID, name, age, grade, and email.
2. **👀 View All Students**: Displays all student details sorted by ID.
3. **🔍 Search Student by ID**: Search for a student by ID. If found, the student’s details are displayed.
4. **✏️ Update Student Details**: Update the name, age, grade, or email of an existing student.
5. **❌ Delete Student**: Remove a student record based on their ID.
6. **🔀 Sort Students**: Sort students by name or age.
7. **🔎 Filter Students by Grade**: Display students who have a specific grade.
8. **🚪 Exit**: Exit the application.

### Sample Menu:
```
||---------------------------------------- -||
||                   MENU                   ||
||------------------------------------------||
||          1) Add new Student              ||
||          2) View all Students            ||
||          3) Search Student by ID         ||
||          4) Update Student details       ||
||          5) Delete Student details       ||
||          6) Sort by Age                  ||
||          7) Filter by Grade              ||
||          8) Exit                         ||
||------------------------------------------||
```



## ✅ Validation Rules
- **ID**: Must be unique and non-empty.
- **Name**: Cannot be empty.
- **Age**: Must be a positive integer.
- **Grade**: Should be a valid letter (e.g., A, B, C).
- **Email**: Must follow a valid email format (e.g., example@domain.com).

## ⚙️ Technologies Used
- **Java 8+**: The application is built using the Java programming language.
- **File Handling**: Data is stored in and loaded from a CSV file using Java I/O operations.

## 💻 How to Compile and Run
1. **Clone the Repository**:
   ```
   git clone https://github.com/yourusername/Student-Management-System.git
   ```

2. **Compile and Run**: Open the project folder in your terminal or IDE and compile the Java classes.
    - To compile:
      ```
      javac Day_21_22/Student_Management_System/Studentt.java
      javac Day_21_22/Student_Management_System/Main_Studentt.java
      ```
    - To run:
      ```
      java Day_21_22.Student_Management_System.Main_Studentt
      ```

---

