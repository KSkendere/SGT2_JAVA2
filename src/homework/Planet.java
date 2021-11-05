package homework;



public class Planet extends SpaceObject {

    private int mass;
    private int velocityX;
    private int velocityY;

    public Planet() {

    }

    public Planet(String name, String type, int width, int height, String color, int coordinateX, int coordinateY, int mass, int velocityX, int velocityY) {
        super(name, type, width, height, color, coordinateX, coordinateY);
        this.mass = mass;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     *Method calculates the distance between two Planets
     * @param otherPlanet
     * @return double
     */
    public double calcDistance (Planet otherPlanet){
        double distance = getCoordinateX()-otherPlanet.getCoordinateX();
        double distance2= getCoordinateY()- otherPlanet.getCoordinateY();
        double distance3= (Math.pow(distance,2)) + (Math.pow(distance2,2));
        return Math.sqrt(distance3);
    }

    final double G1 = 6.67*Math.pow(10,11); ////Gravitational constant, same for everything

    public double calcForce (Planet otherPlanet){

        return (G1*getMass()*otherPlanet.getMass())/Math.pow(calcDistance(otherPlanet),2);
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
}
