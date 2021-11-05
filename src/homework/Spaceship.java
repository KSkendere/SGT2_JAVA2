package homework;



    public class Spaceship extends SpaceObject{
        private int mass;
        private int velocityX;
        private int velocityY;
        private int direction;
        private int acceleration;
        private String fuel;
        private int fuelConsumption;

        public Spaceship() {
        }

        public Spaceship(String name, String type, int width, int height, String color, int coordinateX, int coordinateY, int mass, int velocityX, int velocityY, int direction, int acceleration, String fuel, int fuelConsumption) {
            super(name, type, width, height, color, coordinateX, coordinateY);
            this.mass = mass;
            this.velocityX = velocityX;
            this.velocityY = velocityY;
            this.direction = direction;
            this.acceleration = acceleration;
            this.fuel = fuel;
            this.fuelConsumption = fuelConsumption;
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

        public int setDirection(int direction) {
            this.direction = direction;
            return direction;
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


        public  int  rotate(int degrees) {
            System.out.println(getDirection()+degrees);

            return setDirection(getDirection()+degrees);


        }
//2. accelerate(acc) - move the ship towards the rotation direction by distance acc. This should update coordinateX and coordinateY values. Please use following formulas for calculating this:
//
//DeltaX = cos(α) * acc
//DeltaY = sin(α) * acc
//
//Remember that you should add DeltaX to current coordinateX and deltaY to be added to coordinateY

        public double accelerate (int acc){

            double deltaY=Math.sin(Math.toRadians(getDirection()))*acc;
            double deltaX= Math.cos(Math.toRadians(getDirection()))*acc;
//        System.out.println("sin: " +Math.sin(Math.toRadians(getDirection())));
//        System.out.println("cos: "+ Math.cos(Math.toRadians(getDirection())));
//        System.out.println("delta x: "+ deltaX+ "delta y" + deltaY);
            setCoordinateX(getCoordinateX()+deltaX);
            setCoordinateY(getCoordinateY()+deltaY);
            System.out.println("Coordinate x: " +getCoordinateX());
            System.out.println("Coordinate y: " + getCoordinateY());

            return deltaY;
        }





    }



