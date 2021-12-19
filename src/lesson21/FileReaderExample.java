package lesson21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderExample {
    public static void main(String[] args) {


        Path myPath = Paths.get("c:/sgt");
int count = myPath.getNameCount();
        System.out.println(count);
        myPath.getRoot().iterator();
        while (myPath.iterator().hasNext()){
            System.out.println(myPath.iterator().next().getFileName());
        }
    }
}
