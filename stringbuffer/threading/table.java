package stringbuffer.threading;

import java.util.Scanner;

public class table {
  public static void main(String[] args) {
    int i,j;
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (i=1;i<=10;i++){
      for (j=1;j<=1;j++){
        System.out.println("One Number added successful");
      }
      System.out.println(num + " * " + i + " = " + num*i);
    }
    System.out.println("****** Table is Done ******");
  }
}
