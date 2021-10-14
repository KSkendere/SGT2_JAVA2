package lv.kristine.rocetscience;

public class LaunchPad {

    private static Object Rocket;

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        System.out.println( lv.kristine.rocetscience.Rocket.countRockets());
        System.out.println("Name of the rocket" + rocket1.getName());
        System.out.println("Weight of the rocket" + rocket1.getWeight());



    }

    private static void renameRocket (Rocket rocket, String newName){
        rocket.setName(newName);
    }

    private static void changeWeight (int weight, int newWeight){
        weight = newWeight;
        System.out.println("Weight was changed locally to" + newWeight);
    }
}
