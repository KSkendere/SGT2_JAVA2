package lesson7;

import lv.kristine.rocetscience.Engine;

import java.util.ArrayList;

public class Lesson7App {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape plan", 100);

// If you would like ADD ALREADY MADE ARRAY INTO CONSTRUCTOR
        ArrayList<String> people = new ArrayList<String>();
        people.add("Lauris");
        people.add("Maris");
        people.add("Zina");

        PeopleSpaceShip peopleSpaceShip2 = new PeopleSpaceShip(new Engine(), "To the Moon", 125, 3, people);

        PeopleSpaceShip peopleSpaceShip = new PeopleSpaceShip(new Engine(), "Elan", 100, 3, new ArrayList<String>());

//TO ADD PEOPLE INTO ARRAY AFTER DEFINING ARRAY IN CONSTRUCTOR
        peopleSpaceShip.getNamesOfPeople().add("Elon");
        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Kristine");


// ADD SOME CARGO

        peopleSpaceShip.addCargo();
        spaceShip.addCargo();
// SHOULD RETURN INTEGER
        System.out.println(peopleSpaceShip.addCargo(10));
        System.out.println(peopleSpaceShip);
//EXAMPLE OF OVERLOADING METHOD
        System.out.println("Maja");
        System.out.println(10);
        System.out.println(peopleSpaceShip);

        printInfoAboutSpaceShip(spaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip2);
//Print one line(in parent class)
        SpaceShip spaceShip2 = new SpaceShip();
        spaceShip2.addCargo();
//Print two lines from derived class
        SpaceShip spaceShip3 = new PeopleSpaceShip();
        spaceShip3.addCargo();

        peopleSpaceShip.addCargo();

    }
public static void printInfoAboutSpaceShip(SpaceShip spaceShip){
    System.out.println("I have a spaceship: " + spaceShip);
        }
        }
