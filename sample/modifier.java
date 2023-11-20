package sample;

class A {
  public int a = 4;
  private int b = 5;
  protected int c = 6;
  int d = 7;

  public void met(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}

class B extends A{
  public void met2(){
    System.out.println(a);
//    System.out.println(b);  because b is a private, and it can't be run in sub_class
    System.out.println(c);
    System.out.println(d);
  }
}

public class modifier {
  public static void main(String[] args) {
    B a = new B();
//    a.met();
    System.out.println(a.a);
//    System.out.println(a.b);  because b in private and it can not run in same package;
    System.out.println(a.c);
    System.out.println(a.d);
    a.met2();
  }
}
