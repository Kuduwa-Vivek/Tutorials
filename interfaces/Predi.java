package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

//public class Predi {
//  public static void main(String[] args) {
//    Predicate<Integer> NegativeNumber = x -> x > 0;
//    System.out.println(NegativeNumber.test(5));
//  }
//}


public class Predi {
  public static void main(String[] args) {
    Predicate<Integer> even_odd = x -> x % 2 ==0;
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    for (Integer i : numbers)
      if (even_odd.test(i))
        System.out.println(i);
  }
}



//public class Predi {
//  public static void main(String[] args) {
//    Predicate<String> startwiththisletter = x -> x.toLowerCase().charAt(0)== 'v';
//    System.out.println(startwiththisletter.test("valle "));
//  }
//}