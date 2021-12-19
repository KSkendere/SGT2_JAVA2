package Lesson20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson20Lists {
    public static void main(String[] args) {
        List<String> streets = new ArrayList<String>();



        streets.add("Struktoru");
        streets.get(0);// Struktoru
        streets.add("Rupniecibas");
        streets.add(0,"Olivu");
        System.out.println(streets.toString());
        streets.addAll(streets);//add another collection - any class,that implements
    }
}
