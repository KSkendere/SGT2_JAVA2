package Lesson33;

public class Lesson33 {
    public static void main(String[] args) {
Muliplier muliplier = new Muliplier();
Adder adder = new Adder();
Power power = new Power();

//y=x^2+2x+4

        float x = 2f;

        float p1 = power.pow(x,2);
        float p2 = muliplier.multiply(x,2);
        float p3 = adder.add(p1,p2);
        float p4 = adder.add(p3,4);

        System.out.println("Result" + p4);

    }
}
