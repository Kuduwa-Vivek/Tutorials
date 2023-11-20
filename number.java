//public class number {
//  public static void main(String[] args) {
//    int n = 3;
//    if(n%2==0){
//      System.out.println("Even");
//    }else {
//      System.out.println("odd");
//    }
//  }
//}

import java.util.Scanner;

public class number {
  public static void main(String[] args) {
    while (true) {
      System.out.println("Enter the Number: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      if (num % 2 == 0) {
        System.out.println(num + " is  Even");
      } else {
        System.out.println(num + " is Odd");
      }
    }
  }
}
