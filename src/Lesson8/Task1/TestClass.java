package Lesson8.Task1;

public class TestClass {

    public static void main(String[] args) {

//create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

        Parent parent = new Parent();
        Child child = new Child();
parent.printParentText();
        child.printChildText();
        child.printParentText();



    }
}
