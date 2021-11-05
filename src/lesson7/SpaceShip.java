package lesson7;

import lv.kristine.rocetscience.Engine;

public class SpaceShip {

    private Engine engine = new Engine();
    private String name = "";
    private int cargoSpace = 0;

    public SpaceShip() {
    }

    public SpaceShip(Engine engine, String name, int cargoSpace) {
        this.engine = engine;
        this.name = name;
        this.cargoSpace = cargoSpace;

        }
        public void addCargo(){
            System.out.println("Cargo added");
        }

        public int addCargo(int cargo){
        this.cargoSpace+=cargo;
        return this.cargoSpace;
        }



    @Override
    public String toString() {
        return "SpaceShip{" +
                "engine=" + engine +
                ", name='" + name + '\'' +
                ", cargoSpace=" + cargoSpace +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
}
