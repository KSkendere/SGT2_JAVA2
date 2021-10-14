package lesson4;

import java.util.ArrayList;

public class RomanNumerals4 {
    public static void main(String[] args) {

        int result;

        System.out.println(romanNumeral(25));
        System.out.println(romanNumeral(50));
        System.out.println(romanNumeral(255));
        System.out.println(romanNumeral(500));
        System.out.println(romanNumeral(3999));
        System.out.println(romanNumeral(59));
        System.out.println(romanNumeral(111));
        System.out.println(romanNumeral(105));
        System.out.println(romanNumeral(1));
    }

    /**
     * converts integer to roman numeral in range from 1 till 3999
     *
     * @param integerToConvert
     * @return
     */
    public static String romanNumeral(int integerToConvert) {


        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return  thousands[integerToConvert/1000]+
                hundreds[(integerToConvert%1000)/100]+
                tens [(integerToConvert%100)/10]+
                ones[integerToConvert%10];

    }
}