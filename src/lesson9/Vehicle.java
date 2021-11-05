package lesson9;

public abstract class Vehicle {

    public abstract double calculateFuelEficiancy();
    public double showCurrentSpeed(){
        return Math.random()*100;
    }
}

class Truck extends Vehicle {


    @Override
    public double calculateFuelEficiancy() {
        return 0;
    }
}

class Application {

    public static void main(String[] args) {

        Truck truck = new Truck();

        System.out.println(truck.calculateFuelEficiancy());
        System.out.println(truck.showCurrentSpeed());
    }
}
