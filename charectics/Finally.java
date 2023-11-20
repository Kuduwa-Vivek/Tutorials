package charectics;

import static org.apache.coyote.http11.Constants.a;

public class Finally {
  public static int great(){
    try {
      int a = 50;
      int b = 10;
      int c = a/b;
      return c;
    }catch (Exception e){
      System.out.println(e);
    }
    finally {
      System.out.println("This is end of the Function");

    }
    return 0;
  }
  public static void main(String[] args) {
     int k = great();
    System.out.println(k);
    int x = 8;
    int y = 9;
    while (true){
      try {
        System.out.println(x/y);
      }catch (Exception e){
        System.out.println(e);
        break;
      }
      finally {
        System.out.println("I am finally for value of y = " + y);
      }
      y--;
    }
  }
}
