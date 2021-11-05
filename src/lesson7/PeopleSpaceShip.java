package lesson7;

import lv.kristine.rocetscience.Engine;

import java.util.ArrayList;

public class PeopleSpaceShip extends SpaceShip {

   private int numberOfPeople;
   private ArrayList<String> namesOfPeople = new ArrayList<>();


   public PeopleSpaceShip() {
   }

   public PeopleSpaceShip(Engine engine, String name, int cargoSpace, int numberOfPeople, ArrayList<String> namesOfPeople) {
      super(engine, name, cargoSpace);
      this.numberOfPeople = numberOfPeople;
      this.namesOfPeople = namesOfPeople;

      }

   @Override
   public void addCargo() {
      super.addCargo();
      System.out.println("We have overridden method in people spaceship");
   }

   @Override
   public String toString() {
      return "PeopleSpaceShip{" +
              "numberOfPeople=" + numberOfPeople +
              ", namesOfPeople=" + namesOfPeople +
              "} " + super.toString();
   }

   public int getNumberOfPeople() {
      return numberOfPeople;
   }

   public void setNumberOfPeople(int numberOfPeople) {
      this.numberOfPeople = numberOfPeople;
   }

   public ArrayList<String> getNamesOfPeople() {
      return namesOfPeople;
   }

   public void setNamesOfPeople(ArrayList<String> namesOfPeople) {
      this.namesOfPeople = namesOfPeople;
   }
}


