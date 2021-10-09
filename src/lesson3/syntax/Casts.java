package lesson3.syntax;

import java.sql.Array;
import java.util.ArrayList;

public class Casts {
    public static void main(String[] args) {
        int justAnInteger = 50000;
        System.out.println(justAnInteger);
        System.out.println((long) justAnInteger);
        System.out.println((short) justAnInteger);
        if (justAnInteger > 32000 || justAnInteger < -32000) {
            System.out.println(justAnInteger);
        } else {
            System.out.println((short) justAnInteger);
        }
//        int j = 1;
//        for (int i = 0; i < 50;) {
//
//            System.out.println(i);
//            System.out.println(i+j);
//i=i+j;
//j=i;

        int[] myArray = {4, 5, 6, 7};

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(0, 1);
        myArrayList.add(1, 2);

        for (int k = 0; k < myArrayList.size(); k++) {
            System.out.println(k);

        }

        ArrayList<Integer> myArrayList2 = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < 1001; ) {
            myArrayList2.add(counter, i);
            if (i == 0) {
                i = i + 1;
            }
//            } else if (i == 1) {
//                i += i;}

            else {
                i = myArrayList2.get(counter - 1) + i;
            }
            counter++;


//            System.out.println(myArrayList2.toString());

        }
        System.out.println(myArrayList2.toString());
//


        }
    }






