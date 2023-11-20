package collections;

import java.util.Vector;

public class Vvector {
  public static void main(String[] args) {
    Vector<String> animal = new Vector<>();
    animal.add("Dogs");
    animal.add("Cats");

    animal.add(1,"Horse");
    System.out.println("Animals : " + animal);

    Vector<String> water = new Vector<>();
    water.add("Fish");
    System.out.println("Water Animals :" + water);

    animal.addAll(water);
    System.out.println("New "+animal);

  }
}
