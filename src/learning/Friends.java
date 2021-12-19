package learning;

import java.util.Comparator;
import java.util.Objects;

public class Friends implements Comparable<Friends> {

    private String name;
    private String surname;
    private int age;

    public Friends() {
    }


    public Friends(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friends friends = (Friends) o;
        return age == friends.age && Objects.equals(name, friends.name) && Objects.equals(surname, friends.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
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


//    public int compareTo(Student st){
//        if(age==st.age)
//            return 0;
//        else if(age>st.age)
//            return 1;
//        else
//            return -1;
//    }
//}
//    Sort by age

//    @Override
//    public int compareTo(Friends friends) {
//
//        if(age == friends.age)
//        return 0;
//        else if (age> friends.age)
//            return 1;
//        else
//            return -1;
//    }

//    SORT BY NAME

//    @Override
//    public int compareTo(Friends friends) {
//        return this.name.compareTo(friends.name);}

// SORT BY NAME CASE INSENSITIVE
//
//    @Override
//    public int compareTo(Friends friends) {
//        return String.CASE_INSENSITIVE_ORDER.compare(this.name,friends.name);
//    }
    //    SORT BY SURNAME
//    @Override
//    public int compareTo(Friends friends) {
//        return this.surname.compareTo(friends.surname);
    //    SORT BY SURNAMES SECOND CHAR
//    @Override
//    public int compareTo(Friends friends) {
//        if(surname.charAt(1) == friends.surname.charAt(1))
//        return 0;
//        else if (surname.charAt(1)> friends.surname.charAt(1))
//            return 1;
//        else
//            return -1;
//    }

    //    SORT BY SURNAMES SECOND CHAR, BETTER EXAMPLE

    @Override
    public int compareTo(Friends friends) {
        if(friends.surname.charAt(1) == this.surname.charAt(1))
            return 0;
        else if (friends.surname.charAt(1)< this.surname.charAt(1))
            return 1;
        else
            return -1;
    }




}



