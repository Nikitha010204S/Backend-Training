//Create 3 students mark statement records using jdbc.

package Day_12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Records {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_records";
        String username = "root";
        String password = "";

        String selectSQL = "SELECT student_id, student_name, subject, marks_obtained, total_marks FROM marks_statement";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(selectSQL);
            resultSet = preparedStatement.executeQuery();

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
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
