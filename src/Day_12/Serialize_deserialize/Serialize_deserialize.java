//Exercise 2: Serialize and Deserialize a Java Object
//Steps:
//Create a class that implements the Serializable interface.
//Serialize the object to a file using ObjectOutputStream.
//Deserialize the object from the file using ObjectInputStream.

package Day_12.Serialize_deserialize;

import java.io.*;

public class Serialize_deserialize implements Serializable {
    public static void main(String[] args) {
        Serialize_deserialize sd = new Serialize_deserialize();
        System.out.println("This is serialization - obj to byte stream");
        sd.doser();
        System.out.println("Refer Employee.ser file");
        System.out.println();
        System.out.println("This is deserialization - byte stream to obj");
        sd.dodeser();

    }

    public void doser()
    {
        ObjectOutputStream oos = null;
        try
        {
            Bank_employee be=new Bank_employee(10,"Nikitha","Erode");
            oos=new ObjectOutputStream(new FileOutputStream("Employee.ser"));
            oos.writeObject(be);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                if(oos!=null)
                    oos.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }


    public void dodeser()
    {
        ObjectInputStream ois = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream("Employee.ser"));
            Bank_employee emp=(Bank_employee) ois.readObject();
             System.out.println(emp.getEmp_id());
             System.out.println(emp.getEmp_name());
             System.out.println(emp.getEmp_address());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
