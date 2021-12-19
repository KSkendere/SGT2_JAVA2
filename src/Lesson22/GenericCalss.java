package Lesson22;

import java.util.Date;

//in our class we will be able to define variable
public class GenericCalss <T1> {
    private T1 birthdate;

    <T2> String formatBirthdate(T2 format) {
        if (format instanceof String) {
            System.out.println("It is a String");
        } else if (format instanceof Date) {
            System.out.println("It is a Date");}

            return "result";
        }

    public T1 getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(T1 birthdate) {
        this.birthdate = birthdate;
    }
}





