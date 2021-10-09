package lesson4;

public class Scopes {

    public static void main(String[] args) {

    }
    static int scopeVisible (int someNumber){
        boolean visibleInsideMethod = true;
        return someNumber*2;
    }
}
