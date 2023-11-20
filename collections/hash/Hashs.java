package collections.hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hashs {
  public static void main(String[] args) {
    HashSet<String> name = new HashSet<>();
    name.add("Naveen");
    name.add("Thinakaran");
    name.add("Thinakaran");
    name.add("Lakshmi");
    name.add("Karishma");
    name.add("Sunny");

    Iterator<String> t = name.iterator();
    while (t.hasNext()){
      System.out.println(t.next());
    }
    name.add("one");
    name.add("two");
    name.add("three");
    name.add("four");
    name.add("five");
    Iterator<String> t1 = name.iterator();
    while (t1.hasNext()){
      System.out.println(t1.next());
    }
  }
}
