package homework;

public class Spaceship2 extends SpaceObject {
    private int mass;
    private int velocityX;
    private int velocityY;
    private int direction;
    private int acceleration;
    private String fuel;
    private int fuelConsumption;

    public Spaceship2() {
    }

    public Spaceship2(String name, String type, int width, int height, String color, int coordinateX, int coordinateY,
                      int mass, int velocityX, int velocityY, int direction, int acceleration, String fuel, int fuelConsumption) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.direction = direction;
        this.acceleration = acceleration;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    //1. rotate(degrees) - rotate the ship by x degrees ( remember direction cannot be less than 0 and larger than 360. Calculate the remaining modulus )
//
//    public int rotate (int degrees){
//this.direction = (getDirection()+(degrees));
//        return direction;
//    }

    public int rotate (int degrees){
        setDirection (getDirection()+(degrees));
        return direction;
    }

//    Calculate direction by x and Y asis

    /**Method to calculate ships direction in degress on coordinate asis (from poin 0) if coordinates are known
     *
     */
    public void calcuateDirection() {
        double tangent;
        double angleInRadians;
        double angleInDegrees;
        if (getCoordinateX() > 0 && getCoordinateY() > 0) {
            tangent = (double) getCoordinateY() / (double) getCoordinateX();
            angleInRadians = Math.atan(tangent);
            angleInDegrees = Math.toDegrees(angleInRadians);
//        double angleInDegrees = angleInRadians*180/Math.PI;
            System.out.println( angleInDegrees);
        }else if (getCoordinateX()<0&&getCoordinateY()>0){
            tangent = (double) (getCoordinateX()*-1)/getCoordinateY();
            angleInRadians = Math.atan(tangent);
            angleInDegrees =Math.toDegrees(angleInRadians);
            System.out.println(90+angleInDegrees);

        }else if(getCoordinateX()<0&&getCoordinateY()<0){
            tangent=(double) (getCoordinateX()*-1)/(getCoordinateY()*-1);
            angleInDegrees = Math.toDegrees(Math.atan(tangent));
            System.out.println(270-angleInDegrees);

        }else if(getCoordinateX()>0&&getCoordinateY()<0){
            tangent = (double) (getCoordinateY()*-1)/getCoordinateX();
            angleInDegrees=Math.toDegrees(Math.atan(tangent));
            System.out.println(360-angleInDegrees);
        } else if (getCoordinateX()>0||getCoordinateX()==0&&getCoordinateY()==0){
            System.out.println(0);
        } else if (getCoordinateX()==0&&getCoordinateY()>0){
            System.out.println(90);
        }else if (getCoordinateX()<0&&getCoordinateY()==0){
            System.out.println(180);
        } else if (getCoordinateX()==0&&getCoordinateY()<0){
            System.out.println(270);
        }
    }


    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public int getDirection() {
        return direction;
    }
//    ( degrees 0 - 360 )

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}

