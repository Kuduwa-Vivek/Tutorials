import java.util.Scanner;

public class b {
  public static int vowel(String text){
    int count = 0;
    for (int i=0;i < text.length();i++) {
      char ch = Character.toLowerCase(text.charAt(i));
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    while (true) {
      System.out.println("Enter the Letter");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      int vowel = vowel(input);
      System.out.println(input + " Number of vowels : " + vowel);
    }
  }
}