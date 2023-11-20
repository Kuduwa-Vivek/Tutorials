package collections.arraylist;

import java.util.ArrayList;

public class Arraylist {

  public static void main(String[] args) {
    ArrayList<String> Language= new ArrayList<>();

    // Add element to ArrayList
    Language.add("Java");
    Language.add("C++");
    Language.add("Python");
    System.out.println("Programming Languages: " + Language);

    // Get teh element from arraylist
//    String ele = Language.get(1);
//    System.out.println(ele);

    // Change the element from arraylist
//    Language.set(2, "Carbon");
//    System.out.println("Modified " + Language);

    // Remove element from Index
    String t = Language.remove(1);
    System.out.println("Remove Element : " + t);
    System.out.println("Update ArrayList : " + Language);


  }
}

