//Steps:
//writeExternal(ObjectOutput out) for writing object data.
//readExternal(ObjectInput in) for reading object data.


package Day_12.External_serialize;

import java.io.*;

public class Bank_customer implements Externalizable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private int id;
    private String name;
    private String address;

    Bank_customer() {

    }
    Bank_customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Write External");
        out.writeInt(id);
        out.writeUTF(name);
        out.writeUTF(address);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Read External");
        id = in.readInt();
        name = in.readUTF();
        address = in.readUTF();

    }

    public static void main(String[] args) {
        Bank_customer customer = new Bank_customer(101, "John Doe", "1234 Elm Street");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankCustomer_ser.ser"))) {
            customer.writeExternal(oos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankCustomer_ser.ser"))) {
            Bank_customer deserializedCustomer = new Bank_customer();
            deserializedCustomer.readExternal(ois);
            System.out.println("Deserialized Object:");
            System.out.println("ID: " + deserializedCustomer.getId());
            System.out.println("Name: " + deserializedCustomer.getName());
            System.out.println("Address: " + deserializedCustomer.getAddress());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

