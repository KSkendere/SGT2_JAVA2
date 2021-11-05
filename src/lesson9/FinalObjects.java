package lesson9;

public class FinalObjects {

    public static void main(String[] args) {

        final Rocket rocket = new Rocket(555,252,"petrol");
        System.out.println(rocket);
 // cannot reinitialize variables for final object (all for reference data types)
//        rocket = new Rocket(111,222,"none");
//        but we can do it with setters
        rocket.setWeight(999);
        System.out.println(rocket);
    }
}

class Rocket{

    private int weight;
    private int height;
    private String fuelType;

    public Rocket() {
    }

    public Rocket(int weight, int height, String fuelType) {
        this.weight = weight;
        this.height = height;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "weight=" + weight +
                ", height=" + height +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}