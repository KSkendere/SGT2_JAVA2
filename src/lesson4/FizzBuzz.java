package lesson4;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the next number!");
        int maxNumber = scanner.nextByte();

        for (int i = 1; i <= maxNumber; i++) {
            if (i%3 ==0 && i%5 ==0) {
                System.out.println("FizzBuzz");}
                else if (i%3==0){
                    System.out.println("Fizz");}
                else if (i%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }

        }
    }
}