package Lesson20;

import java.util.*;

public class Lesson20Iteartors {

    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");
        System.out.println(planets);

        Iterator planetIterator = planets.iterator();

        while (planetIterator.hasNext()) {
            System.out.println(planetIterator.next());
            ;
            Set<String> birds = new TreeSet<String>();
            birds.add("Sparrow");
            birds.add("Eagle");

        }
        Queue<String> lidl = new LinkedList<>();
        lidl.add("D");
        lidl.add("B");
        lidl.add("A");
        System.out.println(lidl);

        Iterator lidIterator = lidl.iterator();
        while (lidIterator.hasNext()) {
            System.out.println(lidIterator.next());
        }
    }
}
