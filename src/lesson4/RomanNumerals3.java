package lesson4;

import java.util.ArrayList;

public class RomanNumerals3 {

    public static void main(String[] args) {

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
     * @param integerToConvert
     * @return convertedNumeral
     */
    public static String romanNumeral(int integerToConvert) {

        String convertedString = Integer.toString(integerToConvert);

        ArrayList<Character> characterArrayList = new ArrayList<>();

        for (int i = 0; i < convertedString.length(); i++) {
            characterArrayList.add(i, convertedString.charAt(i));
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        int firstIndexOfArray = Integer.parseInt(String.valueOf(characterArrayList.get(0)));

        String convertedNumeral ="";
        if (characterArrayList.size() == 1) {
            convertedNumeral= ones[integerToConvert];


        } else if (characterArrayList.size() == 2) {
            convertedNumeral= tens[firstIndexOfArray] +
                    ones[Integer.parseInt(String.valueOf(characterArrayList.get(1)))];

        } else if (characterArrayList.size() == 3) {
            convertedNumeral= hundreds[firstIndexOfArray] +
                    tens[Integer.parseInt(String.valueOf(characterArrayList.get(1)))] +
                    ones[Integer.parseInt(String.valueOf(characterArrayList.get(2)))];


        } else if (characterArrayList.size() == 4) {
            convertedNumeral= thousands[firstIndexOfArray] +
                    hundreds[Integer.parseInt(String.valueOf(characterArrayList.get(1)))] +
                    tens[Integer.parseInt(String.valueOf(characterArrayList.get(2)))] +
                    ones[Integer.parseInt(String.valueOf(characterArrayList.get(3)))];

        }
       return convertedNumeral;
    }
}




