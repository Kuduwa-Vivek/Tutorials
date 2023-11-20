package myref;

import java.util.Scanner;

public class buffer_builder {
  public static void main(String[] args) {
//
    System.out.println("Enter the No");
    Scanner sc =  new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(num + " * "+ i + " = " + num*i);
    }


  }
}
