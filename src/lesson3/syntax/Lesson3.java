package lesson3.syntax;

import lesson1.helloWorldLibrary.WorldLibrary;

public class Lesson3 {

    public static void main(String[] args) {
        RocketShip ship = new RocketShip();
        ship.fly(10);
        Bird bird = new Bird();
        bird.fly(20);
        Penguin penguin = new Penguin();
        penguin.fly(10);

        if (penguin instanceof Penguin){
            System.out.println("Penguin is a penguin");
        }
        if (penguin instanceof Bird) {
            System.out.println("Penguin is a bird");
        }

//            if (penguin instanceof RocketShip) {
//                System.out.println("Penguin can not be rocketchip");
//            }

        int result = 2;
        result += 5;
        System.out.println(result);
    }
    public static String boop(){
        return WorldLibrary.getName();
    }
}
enum RocketTypes{

    BEZOS,
    MUSK,
    BRANOSN
}
interface CanFlyInterface{

    boolean fly(int speed);
}

class RocketShip implements CanFlyInterface{

    @Override
    public boolean fly(int speed) {
        System.out.println("Whoosh, I am flying!");
        return false;
    }
}

class Bird implements CanFlyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Civ I am flying");
        return false;
    }
}

class Penguin extends Bird {
    public boolean walk (int speed){
        System.out.println("Quack, Quack");
        return false;
    }


}