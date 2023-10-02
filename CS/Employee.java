package CS;

public class Employee {
    private String employeeId;
    private  String name;
    private  static final   String designation= "Lab Attendant";

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String employeeId,String name,String designation) {
        this.employeeId=employeeId;
        this.name = name;

    }
    public  Employee(){
        this.employeeId="null";
        this.name="null";

    }
}
