package lesson9;

public class NestedClasses {

    //        Inner Class
    static public class InnerClass{


        public String printInnerClass(){
            System.out.println("This is inner class");
            return "Some String returned.";
        }
    }
    public String printSomethingFromInnerClass(){
        InnerClass innerClass = new InnerClass();
        return innerClass.printInnerClass();
    }
}

class mainApplication{
    public static void main(String[] args) {
        NestedClasses.InnerClass inner = new NestedClasses.InnerClass();

    }
}