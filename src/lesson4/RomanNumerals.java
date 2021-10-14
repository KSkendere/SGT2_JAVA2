package lesson4;

import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int userInput = scanner.nextInt();
        String convertedString = Integer.toString(userInput);
        System.out.println(convertedString);
        char[] charArray = convertedString.toCharArray();
        System.out.println(charArray[0]);



        String thousands = "";
        String hundreds = "";
        String tens = "";

        if (charArray.length == 4) {
            switch (charArray[0]) {
                case '1':
                    thousands = "M";
                    break;
                case '2':
                    thousands = "MM";
                    break;
                case '3':
                    thousands = "MMM";
                    break;
            }
            System.out.println("Thousands " + thousands);

        } else if (charArray.length == 3) {
            switch (charArray[0]) {
                case '1':
                    hundreds = "C";
                    break;
                case '2':
                    hundreds = "CC";
                    break;
                case '3':
                    hundreds = "CCC";
                    break;
                case '4':
                    hundreds = "CD";
                    break;
                case '5':
                    hundreds = "D";
                    break;
                case '6':
                    hundreds = "DC";
                    break;
                case '7':
                    hundreds = "DCC";
                    break;
                case '8':
                    hundreds = "DCCC";
                    break;
                case '9':
                    hundreds = "CM";
                    break;
            }

            System.out.println(hundreds);
        } else if (charArray.length == 2) {
            switch (charArray[0]) {
                case '1':
                    tens = "X";
                    break;
                case '2':
                    tens = "XX";
                    break;
                case '3':
                    tens = "XXX";
                    break;
                case '4':
                    tens = "XL";
                    break;
                case '5':
                    tens = "L";
                    break;
                case '6':
                    tens = "LX";
                    break;
                case '7':
                    tens = "LXX";
                    break;
                case '8':
                    tens = "LXXX";
                    break;
                case '9':
                    tens = "XC";
                    break;
            }
            System.out.println(tens);

        } else if (charArray.length == 1) {

            switch (userInput) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
            }


        }

//                Symbol       Value
//                I             1
//                V             5
//                X             10
//                L             50
//                C             100
//                D             500
//                M             1000
        if (charArray.length == 4) {
            System.out.println(thousands+hundreds+tens);
        }
    }
}


