package tasks;

import java.util.Scanner;

public class Perfect {
  public static void main(String[] args) {
     while (true) {
      int n, sum = 0,i = 1;
      System.out.println("Enter the Number :");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      while (i <= n / 2) {
        if (n % i == 0) {
          sum = sum + i;
        }
        i++;
      }
      if (sum == n) {
        System.out.println(n + " : it is a Prefect Number");
        System.out.println("Lets try Another Number: \n");
      } else {
        System.out.println(n + " : it is not a Perfect Number.");
        System.out.println("Lets try Next Number: \n");
      }
    }
  }
}
