package lesson4;

import java.util.ArrayList;

public class MyAtoi2 {


    public static void main(String[] args) {

        System.out.println(myAtoi("98993489"));
        System.out.println(myAtoi("This is not an integer"));
        System.out.println(myAtoi("-1234567"));
        System.out.println(myAtoi("999999999999999999999999999"));
        System.out.println(myAtoi("   -658!!some text"));
        System.out.println(myAtoi("45487985745879554477854477558877444"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("      "));
        System.out.println(myAtoi("     -      "));

    }

    /**
     * Method to return integer from string with plus or minus sign and ignoring signs after digits
     * @param s
     * @return result
     */
    public static int myAtoi(String s) {
//        IGNORE ANY LEADING WHITESPACE
        s = s.trim();
//       Check if  next character (if not already at the end of the string) is '-' or '+'
        boolean isNegative = false;
        ArrayList<Character> sArrayList = new ArrayList<>();
        if (s.length() == 0) {
            return 0;
        } else if (s.charAt(0) == '-') {
            isNegative = true;
        }
//        Read in next the characters until the next non-digit charcter or the end of the input is reached.
//        The rest of the string is ignored.
        if ((s.charAt(0) == '+') || (s.charAt(0) == '-')) {
            int counter = 0;
            for (int i = 1; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    break;
                }
                sArrayList.add(counter, s.charAt(i));
                counter++;
            }
        } else {
            int counter2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    break;
                }
                sArrayList.add(counter2, s.charAt(i));
                counter2++;
            }
        }
        String stringResult = new String();
//        If no digits were read, then the integer is 0
        if (sArrayList.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i < sArrayList.size(); i++) {
                stringResult = stringResult + sArrayList.get(i);
            }
        }
        double result = Double.parseDouble(stringResult);
        if (isNegative) {
            result = result * -1;
        }
        if (result >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else return (int) result;
    }
}





