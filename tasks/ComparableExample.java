package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Person other) {
    return Integer.compare(this.age, other.age);
  }

  @Override
  public String toString() {
    return name + " (Age: " + age + ")";
  }
}

public class ComparableExample {
  public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("Alice", 25));
    people.add(new Person("Bob", 30));
    people.add(new Person("Charlie", 20));

    Collections.sort(people); // Sorts the list based on natural ordering (age)

    for (Person person : people) {
      System.out.println(person);
    }
  }
}