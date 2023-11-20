package collections.arraylist;

import java.util.LinkedList;

public class Linke {
  public static void main(String[] args) {
    LinkedList<String> name = new LinkedList<>();
    name.add("Pushkar");
    name.add("Kshitij");
    name.add("Adarsh");
    name.add("Mukesh");
    System.out.println("List if names : " + name);

    // using set to update value
//    System.out.println("Update to Retesh");
//    name.set(0, "Retesh");
//    System.out.println(name);

    // using get
//    String str = name.get(3);
//    System.out.println(str);


    // using remove function

    String str = name.remove(1);
    System.out.println("Removing the name from index One : " + str);
    System.out.println("Update List : " + name);


  }
}
