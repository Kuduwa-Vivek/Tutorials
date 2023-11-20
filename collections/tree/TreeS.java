package collections.tree;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeS {
  public static void main(String[] args) {
    TreeSet<String> name = new TreeSet<>();
    name.add("Ravi");
    name.add("Om");
    name.add("Shubham");
    name.add("Prashant");
    name.add("Omkar");
    System.out.println("Iterate them in ascending order...");
    Iterator<String> i = name.iterator();
    while (i.hasNext()){
      System.out.println(i.next());

      System.out.println("Iterate in desecending order...");
      Iterator i1 = name.descendingIterator();
      while (i1.hasNext()){
        System.out.println(i1.next());
      }
    }
  }
}
