//In this exercise, you will create a new file (e.g., name.txt) and write your name to it.
//Task:
//Write a program that:
//Creates a new text file called name.txt.
//Write your name to the file.
package Day_12;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Write_name {
    public void write_file()
    {
        BufferedWriter bw = null;
        try
        {
            bw=new BufferedWriter(new FileWriter("name.text"));
            String temp="Nikitha";
            bw.write(temp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            try {
                if(bw!=null)
                    bw.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String args[])
    {
        Write_name obj=new Write_name();
        obj.write_file();
    }
}

