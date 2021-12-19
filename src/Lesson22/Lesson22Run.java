package Lesson22;

import java.util.Date;
import java.util.HashMap;

public class Lesson22Run {
    public static void main(String[] args) {
        GenericCalss<String> firstDate = new GenericCalss<>();
        firstDate.setBirthdate("2021-11-15");
        System.out.println(firstDate.getBirthdate());

        GenericCalss<Date>secondDate = new GenericCalss<>();
        secondDate.setBirthdate(new Date());
        System.out.println(secondDate.getBirthdate());

        secondDate.formatBirthdate(new String());

    }

}
