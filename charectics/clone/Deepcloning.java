package charectics.clone;

class Deep {
  int i, j;
}

public class Deepcloning {
  public static void main(String[] args) {
   Deep d = new Deep();
   d.i = 5;
   d.j =5;
   Deep d1 = d;
   d1.i = d.i; // DeepCloning
   d1.j = d.j; // DeepCloning
    System.out.println(d1.i);
    System.out.println(d1.j);
  }
}
