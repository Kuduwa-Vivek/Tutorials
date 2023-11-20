package interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

//public class consume {
//  public static void main(String[] args) {
//    Consumer<String> consumer = s -> System.out.println(s);
//    consumer.accept("Write a name");
//  }
//}


//public class consume {
//  public static void main(String[] args) {
//    Consumer<List<Integer>> listConsumer1 = li -> {
//      for (Integer i : li){
//        System.out.println(i + 100);
//      }
//    };
//    listConsume1.accept(Arrays.asList(1,2,3,4,5,6));
//  }
//}


// using andthen
//public class consume {
//  public static void main(String[] args) {
//    Consumer<List<Integer>> listConsumer1 = li -> {
//      for (Integer i : li){
//        System.out.println(i + 100);
//      }
//    };
//    Consumer<List<Integer>> listConsumer2 = li2 -> {
//      for (Integer i : li2){
//        System.out.println(i);
//      }
//    };
//    listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4,5));
//  }
//}

public class consume {
  public static void main(String[] args) {
    Consumer<List<String>> consume = c -> {
      for (String i : c){
        System.out.println(i);
      }
    };
    consume.accept(Arrays.asList("Vivek","Adarsh","Pushakar","Kshitij"));
  }
}