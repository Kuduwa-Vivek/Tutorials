package collections.tree;

import java.util.Map;
import java.util.TreeMap;

public class TreeM {
  public static void main(String[] args) {
    TreeMap<Integer,String> data = new TreeMap<>();
    data.put(1, "Keashav");
    data.put(2, "Karishmi");
    data.put(3, "Lakshmi");
    data.put(4, "Thinakran");
    for (Map.Entry m : data.entrySet()){
      System.out.println(m.getKey() + " : " + m.getValue());
    }
  }
}
