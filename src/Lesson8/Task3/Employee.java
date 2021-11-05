package Lesson8.Task3;

public class Employee extends Member {
    private String specialization;

    public Employee() {
    }

    public Employee(String name, int age, String phoneNumber, String address, int salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "specialization='" + specialization + '\'' +
                "} " + super.toString();
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
