package lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class RomanNumerals2 {

    public static void main(String[] args) {

romanNumeral();
    }

    public static void romanNumeral() {
        int userInput= 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter an integer");
            userInput = scanner.nextInt();
            if (userInput < 1 || userInput>3999)
            System.out.println("Integer must be not smaller than 1 and bigger than 3999");
        }  while (userInput < 1 || userInput>3999);
            String convertedString = Integer.toString(userInput);
            ArrayList<Character> characterArrayList = new ArrayList<>();
            for (int i = 0; i < convertedString.length(); i++) {
                characterArrayList.add(i, convertedString.charAt(i));
            }
            int firstIndexOfArray = Integer.parseInt(String.valueOf(characterArrayList.get(0)));

            String[] thousands = {"", "M", "MM", "MMM"};
            String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


            if (characterArrayList.size() == 1) {
                System.out.println(ones[userInput]);


            } else if (characterArrayList.size() == 2) {
                System.out.println(tens[firstIndexOfArray] +
                        ones[Integer.parseInt(String.valueOf(characterArrayList.get(1)))]);


            } else if (characterArrayList.size() == 3) {
                System.out.println(hundreds[firstIndexOfArray] +
                        tens[Integer.parseInt(String.valueOf(characterArrayList.get(1)))] +
                        ones[Integer.parseInt(String.valueOf(characterArrayList.get(2)))]);


            } else if (characterArrayList.size() == 4) {
                System.out.println(thousands[firstIndexOfArray] +
                        hundreds[Integer.parseInt(String.valueOf(characterArrayList.get(1)))] +
                        tens[Integer.parseInt(String.valueOf(characterArrayList.get(2)))] +
                        ones[Integer.parseInt(String.valueOf(characterArrayList.get(3)))]);
            }


        }

    }


