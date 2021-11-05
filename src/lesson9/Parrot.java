package lesson9;

public class Parrot implements WalkableInterface, FlyableInterface{
    @Override
    public void fly(int height) {
        System.out.println("I am flying so high" + height);
    }

    @Override
    public void walk(int speed) {
        System.out.println("I am walking so fast" + speed);
    }
}
