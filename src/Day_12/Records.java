//Create 3 students mark statement records using jdbc.

package Day_12;
import java.sql.*;

public class Records {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_records";
        String username = "root";
        String password = "";

        String insertSQL1 = "INSERT INTO marks_statement (student_id, student_name, subject, marks_obtained, total_marks) VALUES (100, 'John Doe', 'Mathematics', 85, 100)";
        String insertSQL2 = "INSERT INTO marks_statement (student_id, student_name, subject, marks_obtained, total_marks) VALUES (101, 'Jane Smith', 'Science', 92, 100)";
        String insertSQL3 = "INSERT INTO marks_statement (student_id, student_name, subject, marks_obtained, total_marks) VALUES (102, 'Emily Davis', 'History', 78, 100)";

        Connection connection = null;
        Statement statement = null;
         ResultSet resultSet = null;
        try {

            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            statement.executeUpdate(insertSQL1);
            statement.executeUpdate(insertSQL2);
            statement.executeUpdate(insertSQL3);
            System.out.println("Student records inserted successfully.");

            String selectSQL = "SELECT student_id, student_name, subject, marks_obtained, total_marks FROM marks_statement";
           resultSet = statement.executeQuery(selectSQL);

            System.out.println("Student Records:");
            System.out.println("-------------------------------------------------");
            System.out.printf("%-10s %-20s %-15s %-15s %-15s%n", "Student ID", "Student Name", "Subject", "Marks Obtained", "Total Marks");
            System.out.println("-------------------------------------------------");

            while (resultSet.next()) {
                int studentId = resultSet.getInt("student_id");
                String studentName = resultSet.getString("student_name");
                String subject = resultSet.getString("subject");
                int marksObtained = resultSet.getInt("marks_obtained");
                int totalMarks = resultSet.getInt("total_marks");

                System.out.printf("%-10d %-20s %-15s %-15d %-15d%n", studentId, studentName, subject, marksObtained, totalMarks);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
