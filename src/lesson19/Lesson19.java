package lesson19;

import Exceptions.DBException;
import Exceptions.DBPasswordAllCapitalsException;
import Exceptions.DBPasswordIncorrectException;

public class Lesson19 {
    public static void main(String[] args) {
        Lesson19Exceptions exceptions = new Lesson19Exceptions();
        exceptions.divideByNumber(100, 50);
        exceptions.divideByNumber(100, 0); //Exception will be thrown
        try {
            exceptions.divideByNumber2(100, 0); //Exception will be thrown
        } catch (ArithmeticException e) {
            System.out.println("Handle code somewhat differently");
        }


        try {
            exceptions.multiplyByTo(5);

        } catch (ArithmeticException e) {
            System.out.println("Even wrapped exceptions will be handled");
        } finally {
            System.out.println("This will be called all the time");
        }

        System.out.println("If there is another code after try catch finally it will still be executed");
        try {
            System.out.println("Connecting to database");
            throw new DBPasswordAllCapitalsException();

        } catch (DBException e) {
            System.out.println("OUR exception has been correctly handled");
            ;
            if (e instanceof DBPasswordIncorrectException) {
                System.out.println("Password is incorect");
            }
        }

        
    try

    {
        throw new DBException("Some custom message");
    }catch (DBException e){
        System.out.println("There was DB Exeption" + e.getMessage());
    }
    }
}
