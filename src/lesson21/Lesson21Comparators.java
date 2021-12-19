package lesson21;

import java.util.*;

public class Lesson21Comparators {
    public static void main(String[] args) {


        Set<Student> students = new TreeSet<Student>() {
        };

        Student student1 = new Student(1, "aaa");
        Student student2 = new Student(2, "zzz");
        Student student3 = new Student(3, "asd");
    students.add(student1);
    students.add(student2);
    students.add(student3);

        System.out.println(students);

        Iterator sIterator = students.iterator();

    }
}


        class Student implements Comparable<Student> {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }

            @Override
            public int compareTo(Student student) {

                if (student.name.charAt(1) < this.name.charAt(1)) {
                    return 1;
                } else if (student.name.charAt(1) > this.name.charAt(1)) {
                    return -1;
                } else {return 0;}
            }
        }


