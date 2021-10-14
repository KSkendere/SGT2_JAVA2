package lesson4;

import java.util.ArrayList;

public class MyAtoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("  -5789.28"));
        System.out.println(myAtoi("   -367.25"));
        System.out.println(myAtoi("-91"));
        System.out.println(myAtoi("some text 55"));
        System.out.println(myAtoi("+658!!some text"));
        System.out.println(myAtoi("45487985745879554477854477558877444"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("      "));
        System.out.println(myAtoi("     -      "));
    }

    public static int myAtoi(String s) {
        //        IGNORE ANY LEADING WHITESPACE
        s = s.trim();
//       Check if  next character (if not already at the end of the string) is '-' or '+'
        char[] sArray = new char[s.length()];
        int sign = 1;
        if (s.length() == 0) {
            return 0;
        } else if (s.charAt(0) == '-') {
            sArray = new char[s.length() - 1];
            for (int i = 1; i < s.length(); i++) {
                sArray[i - 1] = s.charAt(i);
            }
            sign = -1;
        } else if (s.charAt(0) == '+') {
            sArray = new char[s.length() - 1];
            for (int i = 1; i < s.length(); i++) {
                sArray[i - 1] = s.charAt(i);
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                sArray[i] = s.charAt(i);
            }
        }
        ArrayList<Character> sArrayList = new ArrayList<>();
        int counter = 0;
        String convertedString = new String(sArray);
        for (int i = 0; i < convertedString.length(); i++) {

            if (!Character.isDigit(convertedString.charAt(i))) {
                break;
            }
            sArrayList.add(counter, convertedString.charAt(i));
            counter++;
        }
        String result = new String();
        if (sArrayList.size() == 0) {
            return 0;
        } else {

            for (int i = 0; i < sArrayList.size(); i++) {
                result = result + sArrayList.get(i);
            }
        }

        double longResult = Double.parseDouble(result) * sign;
        if (longResult >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (longResult <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else return (int) longResult;
    }
}






