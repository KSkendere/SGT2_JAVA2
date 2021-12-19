package learning;

import java.util.*;

public class Employees {

    private String name;
    private String surname;
    private int age;

    public Employees() {
    }

    public Employees(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return age == employees.age && name.equals(employees.name) && surname.equals(employees.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public static void main(String[] args) {
        Employees employees1 = new Employees("Marta","Zīle",19);
        Employees employees2 = new Employees("Marta","Zīle",19);
        Employees employees3 = new Employees("Marta","Zīle",19);

        System.out.println(employees1.equals(employees2));
        System.out.println(employees2.equals(employees3));
        System.out.println(employees1.equals(employees3));
        System.out.println(employees1.hashCode());
        System.out.println(employees2.hashCode());
        System.out.println(employees3.hashCode());

        if (employees1 == employees1){
            System.out.println("eaqual");
        }else System.out.println("not equal");

        int hash = 5;
        int something =2;
        int somethingelse =2;
        hash = 2*hash+10;//20
        hash = something*hash-10;//30
        hash =somethingelse*hash-5;//55
        System.out.println(hash);

        LinkedList<String> myList = new LinkedList<String>();

        myList.add(0,"Emo");
        myList.add("Goose");
        myList.add("is");
        myList.add("Kristine");
        myList.add(".");
        System.out.println(myList);

        myList.remove("is");
        System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.indexOf("Kristine"));
        myList.remove(1);
        System.out.println(myList);
        System.out.println(myList.lastIndexOf("."));
        System.out.println(myList.peekLast());
        myList.push("hei");
        myList.add("hello");
        System.out.println(myList);

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(10);
        System.out.println(myStack.elementAt(2));
        System.out.println(myStack);
        Iterator myIterator = myStack.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next() + "");
        }

        TreeSet mySet = new TreeSet();

        mySet.add(101);
        mySet.add(2);
        mySet.add(5);
        mySet.add(101);
        mySet.add(6);
        mySet.add(7);
        mySet.add(9);
        System.out.println(mySet);
        System.out.println(mySet.first());
        System.out.println(mySet.last());

        Iterator setIterator = mySet.descendingIterator();

        while (setIterator.hasNext()){
            System.out.println(setIterator.next() + "");
        }

        System.out.println(mySet);
        for (int i = 0; i < 2; i++) {
            mySet.pollLast();
        }
        System.out.println(mySet.last());


       }




    }

