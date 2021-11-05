package homework;

public class TestClass {

        public static void main(String[] args) {


            Planet planet = new Planet();
            planet.setCoordinateX(3);
            planet.setCoordinateY(5);
            planet.setMass(100);

            Planet planet1 = new Planet();
            planet1.setCoordinateX(10);
            planet1.setCoordinateY(8);
            planet1.setMass(200);



            System.out.println(planet.calcDistance(planet1));
//        double G = 6.673e-11;
//        final double G1 = 6.67 * Math.pow(10, -11);
//        System.out.println(G);
//        System.out.println(G1);



            System.out.println(planet.calcForce(planet1));

//        Spaceship spaceship = new Spaceship2();
//        spaceship.setCoordinateX(90);
//        spaceship.setCoordinateY(0);
//        spaceship.calcuateDirection();
//        spaceship.setDirection(280);
//        System.out.println(spaceship.rotate(-50));
//        System.out.println(spaceship.getDirection());

            Spaceship spaceship1 = new Spaceship();
            spaceship1.setCoordinateY(300);
            spaceship1.setCoordinateX(300);
            spaceship1.setDirection(30);
//        spaceship1.accelerate(4);
//        spaceship1.rotate(30);
//        spaceship1.rotate(-20);


//        System.out.println(spaceship.getDirection());
//        spaceship.accelerate(4);
//
//
//        spaceship.setCoordinateX(5);
//        spaceship.setCoordinateY(5);
//RunKeys runKeys = new RunKeys(spaceship1);
            Spaceship spaceship = new Spaceship();
            spaceship.setCoordinateY(250);
            spaceship.setCoordinateX(250);
            spaceship.setDirection(50);

            KeyListenerExapmle keyListenerExapmle = new KeyListenerExapmle(spaceship1);
//new KeyListenerExapmle(spaceship1);




        }
    }


