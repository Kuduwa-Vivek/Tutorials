package interfaces;

import java.util.function.Function;

//public class funct {
//  public static void main(String[] args) {
//    Function<String,Integer> function = x -> x.length();
//    System.out.println(function.apply("Function"));
//  }
//}

public class funct {
  public static void main(String[] args) {
    Function<String,Integer> function = x -> x.length();
    System.out.println(function.apply("Hum And Tum"));
  }
}

//using chaining

//public class funct {
//  public static void main(String[] args) {
//    Function<String,String> function1 = x -> x.toUpperCase();
//    Function<String,String> function2 = y -> y.substring(0,3);
//
//    System.out.println(function1.andThen(function2).apply("VIVEK"));
//
//  }
//}


//public class funct {
//  public static void main(String[] args) {
//    Function<Integer, Integer> function = x -> 2 * x;
//    Function<Integer, Integer> function1 = x -> x * x * x;
//    System.out.println(function.andThen(function1).apply(3));
//    System.out.println(function1.andThen(function).apply(3));
//    System.out.println(function.compose(function1).apply(4));
//    Function<String, String> functionidentity = Function.identity();
//    System.out.println(functionidentity.apply("What Identity will I give that only will will print"));
//
//  }
//}