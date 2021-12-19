package Lesson20;

import java.util.HashMap;
import java.util.Map;

public class LessonMaps {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<String, Integer>();

        students.put("Kristine",42);
        students.get("Kristine");//returns42
        students.containsKey("Kristine");//returns true
        students.containsValue(42);//returns tru
        //do not have dublicate values
        students.values();


    }
}
