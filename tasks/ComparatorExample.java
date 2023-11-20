package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persons {
  private String name;
  private int age;

  public Persons(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name + " (Age: " + age + ")";
  }
}

public class ComparatorExample {
  public static void main(String[] args) {
    List<Persons> people = new ArrayList<>();
    people.add(new Persons("Alice   ", 25));
    people.add(new Persons("Bob     ", 30));
    people.add(new Persons("Charlie ", 20));

    Comparator<Persons> byName = Comparator.comparing(p -> p.toString());

    Collections.sort(people, byName); // Sorts the list by name

    for (Persons person : people) {
      System.out.println(person);
    }
  }
}