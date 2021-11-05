package Lesson8.Task3;

public class Manager extends Member {

    private String department;

    public Manager() {
    }

    public Manager(String name, int age, String phoneNumber, String address, float salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
