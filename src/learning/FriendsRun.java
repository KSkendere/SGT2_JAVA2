package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FriendsRun {
    public static void main(String[] args) {

        List<Friends> myFriends = new ArrayList<Friends>();
        Friends friend1 = new Friends("Lauris","Škendrs",25);
        Friends friend2 = new Friends("Kārlis", "Ilziņš",30);
        Friends friend3 = new Friends("Laura", "Augstkalna",20);
        Friends friend4 = new Friends("Karlīna","Barziņa",60);

        myFriends.add(friend1);
        myFriends.add(friend2);
        myFriends.add(friend3);
        myFriends.add(friend4);

        Collections.sort(myFriends);
        System.out.println(myFriends);

        List<Integer> myIntegerList = new ArrayList<>();


     myIntegerList.add(5);
     myIntegerList.add(105);
     myIntegerList.add(7);
     myIntegerList.add(2);
     Collections.sort(myIntegerList);
        System.out.println(myIntegerList);

        Comparator<Friends> cm1=Comparator.comparing(Friends::getName);
        Collections.sort(myFriends,cm1);

        System.out.println(myFriends);

        Comparator<Friends> cm2=Comparator.comparing(Friends::getSurname);
        Collections.sort(myFriends,cm2);

        System.out.println(myFriends);

        Comparator<Friends> cm3=Comparator.comparing(Friends::getAge);
        Collections.sort(myFriends,cm3);

        System.out.println(myFriends);

        Comparator<Friends> cm4=Comparator.comparing(Friends::getName);
        Collections.sort(myFriends,cm3);

        System.out.println(myFriends);

    }
}
