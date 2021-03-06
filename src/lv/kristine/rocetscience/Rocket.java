package lv.kristine.rocetscience;

/**
 * Rocket class for building spaceships
 */
public class Rocket {

    private String name;
    private String color;
    private int weight;
    private int height;
    private Engine engine;
    private static int rocketCounter;
    public String id;

    public Rocket() {
        addRocket();
    }

    public Rocket(String name, String color, int weight, int height, Engine engine) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.engine = engine;
        addRocket();
    }

    static int countRockets(){
        return rocketCounter;
    }

    static void addRocket (){
        rocketCounter++;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}
