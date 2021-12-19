package lesson21;

import java.io.*;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) {
//        STDOUT
        System.out.println("This is System STDOUT");
//        STDIN
        Scanner scanner = new Scanner(System.in);
        String sysIn = scanner.next();
//STDERR
//        throw new Exception("Throwing new exception into STDERR stream.")
        File newFile = new File("myOutput.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
            writer.write("This");
            writer.append("This");
            writer.close();
        } catch (IOException e) {
            System.out.println("File does not exist");
        }
    }
}
