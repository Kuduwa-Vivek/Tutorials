package interfaces.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Compart {
  public static void main(String[] args) {
//    Comparator<Integer> com = new Comparator<Integer>() {
//      @Override
//      public int compare(Integer i, Integer j) {
//        if (i%10 < j%10)
//        return -1;
//        else
//          return 1;
//      }
//    };
//
//    ArrayList<Integer> nums = new ArrayList<>();
//    nums.add(27);
//    nums.add(69);
//    nums.add(92);
//    nums.add(18);
//    nums.add(73);
//    Collections.sort(nums ,com);
//    System.out.println(nums);

    while (true) {
      System.out.println("Ente the No :");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      if (num % 2 == 0)
        System.out.println(num + " : is Even");
      else
        System.out.println(num + " : is Odd");
    }
  }
}
