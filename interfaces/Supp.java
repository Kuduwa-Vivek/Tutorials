package interfaces;

import java.util.function.Supplier;

public class Supp {
  public static void main(String[] args) {
    Supplier<Integer> supplier = () -> 100;
    System.out.println(supplier.get());
  }
}
