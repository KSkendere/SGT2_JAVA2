package lesson21;

import java.util.*;

public class Lesson21Dequeue {
    //    main methd
    public static void main(String[] args) {
        Deque<String> myDeque = new ArrayDeque<String>();

        myDeque.addFirst("one");
        myDeque.addFirst("second");
        myDeque.addFirst("third");
        // I want to get nr.3
        String removedElement = myDeque.removeFirst();
        System.out.println(removedElement);
//I want to get 2
        removedElement = myDeque.removeFirst();
        System.out.println(removedElement);

//        now adding 4 on top
        myDeque.addFirst("four");

        removedElement = myDeque.removeLast();//returns 1
        System.out.println(removedElement);

        List<CustomObject> mylist = new ArrayList<>();
        CustomObject co1 = new CustomObject();
        CustomObject co2 = new CustomObject();
        mylist.add(co1);
        mylist.add(co2);
        Iterator mIterator = mylist.iterator();
        while (mIterator.hasNext()) {
            System.out.println(mIterator.next());
        }

        String pet1 = new String("parrot") ;
        String pet2 = new String("parrot");
        if (pet1 == pet2) {
            System.out.println("They are the same");
        }


//        //the same as
        if (pet1.equals(pet2)) {
            System.out.println("Tey are the same");
        }
    }
}



   class CustomObject {
       String customField;
       int customInt;
       int id;

       public CustomObject() {
       }

       @Override
       public boolean equals(Object o) {
           if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;
           CustomObject that = (CustomObject) o;
           return customInt == that.customInt && id == that.id && customField.equals(that.customField);
       }

       @Override
       public int hashCode() {
           return Objects.hash(customField, customInt, id);
       }
   }



