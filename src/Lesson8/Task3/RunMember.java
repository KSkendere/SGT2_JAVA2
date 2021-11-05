package Lesson8.Task3;

import Lesson8.Task3.Employee;
import Lesson8.Task3.Manager;
import Lesson8.Task3.Member;

public class RunMember {
    public static void main(String[] args) {
        Member member = new Member();
        member.setSalary(1000.25F);
        member.printSalary();

        Employee employee = new Employee("Antons Kalniņš",25,"226699442",
                "Rīga, Strautu 5/6-19", 20000, "automehāniķis");

        System.out.println(employee.toString());

        employee.printSalary();

        Manager manager = new Manager("Jānis Krūmiņš", 55, "225577889",
                "Rīga, Pūces 5- 67",1987.83f,"grāmatvedība");

        System.out.println(manager.toString());
                 manager.printSalary();

    }
}
