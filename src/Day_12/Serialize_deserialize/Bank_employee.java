package Day_12.Serialize_deserialize;

import java.io.Serializable;

public class Bank_employee implements Serializable {

    private int emp_id;
    private String emp_name;
    private String emp_address;

    public Bank_employee(int emp_id, String emp_name, String emp_address) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

}
