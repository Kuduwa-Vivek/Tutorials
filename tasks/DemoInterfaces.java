package tasks;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoInterfaces {

  public static void main(String[] args) {
    Runnable runnable = () -> System.out.println("Hello India");
    Function<String, Integer> function = someString -> someString.length();
    BiFunction<String, String, Integer> biFunction =
        (someString, someOtherString) -> someString.length() + someOtherString.length();
    Consumer<String> consumer = someString -> System.out.println(someString);
    Supplier<String> supplier = () -> "Hello India";
    Predicate<String> predicate = someString -> someString.length() <= 5;

    for (int i = 0; i < 10; i++) {
      runnable();
    }

    TriFunction<String, String, String, Integer> triFunction =
        (s1, s2, s3) -> s1.length() + s2.length() + s3.length();

    Integer lengthOf3 = triFunction.shashank("Shashank", "Tushar", "Chaitanya");
    System.out.println(lengthOf3);
  }

  public static void runnable() {
    System.out.println("Hello India");
  }

  public static Integer function(String someString) {
    return someString.length();
  }

  public static void consumer(String someString) {
    System.out.println(someString);
  }

  public static String supplier() {
    return "Hello India";
  }

  public static Boolean predicate(String someString) {
    return someString.length() <= 5;
  }

  @FunctionalInterface
  interface TriFunction<T, U, V, R> {

    R shashank(T t, U u, V v);
  }
}

