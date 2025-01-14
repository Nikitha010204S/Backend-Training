//Using any two buffers for Reading and Writing Data

package Day_12.Buffer;
import java.io.*;

public class Read_write_buffer {
    public static void main(String[] args) {

        String outputstr = "output.txt";
        String inputstr = "D:\\Training_Backend\\src\\Day_12\\Buffer\\input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputstr));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputstr))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Data has been read and written to " + outputstr);

        } catch (FileNotFoundException e) {
            System.err.println("The file was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("An I/O error occurred.");
            e.printStackTrace();
        }
    }
}
