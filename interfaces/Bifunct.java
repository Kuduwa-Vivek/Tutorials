package interfaces;

import java.util.function.BiFunction;

public class Bifunct {
  public static void main(String[] args) {
    BiFunction<String,String,Integer> bifunction = (String1 , String2) -> String1.length() + String2.length();
    System.out.println(bifunction.apply("Vivek", "Kuduwa"));
  }
}
