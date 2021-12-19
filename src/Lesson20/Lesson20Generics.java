package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Lesson20Generics {
    public static void main(String[] args) {
        List myList = new ArrayList<>();//not addding generig data type (assumes is superclass obeject, needs casting later
        myList.add("Some Text");
        String someText = (String) myList.get(0);
        //Equals to
        List<String>myList2 = new ArrayList<>();//generics are included in beginning
    }
}
