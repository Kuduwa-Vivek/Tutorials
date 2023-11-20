package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aeiou {
  public static int countVowels(String text) {
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      char ch = Character.toLowerCase(text.charAt(i));
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    while (true) {
      System.out.print("Enter a string: ");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      int vowelCount = countVowels(input);
      System.out.println(input + " Number of vowels: " + vowelCount);
      System.out.println("");
    }
  }
}

