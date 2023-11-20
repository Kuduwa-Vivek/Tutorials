package charectics.clone;
class Shallow{
  int i;
  int j;
}
public class Shallowclonong {
  public static void main(String[] args) {
    Shallow s = new Shallow();
    s.i=5;
    s.j=6;
    Shallow s1 = s; // Shallow Copy
    System.out.println(s1.i);
  }
}

