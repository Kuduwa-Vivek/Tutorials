package overriding;
class Base{
  public void fun(){
    System.out.println("Base Fun..");
  }
  public void gun(){
    System.out.println("Base Gun..");
  }
}
class Derived extends Base{
  public void fun(){
    System.out.println("Derived Fun..");
  }
  public void sun(){
    System.out.println("Derived Sun..");
  }
}
public class Override {
  public static void main(String[] args) {
    // Up_Casting
    Base bp = new Derived();
    bp.fun();
    bp.gun();
//    ((Derived)bp).sun();

//    Derived d = new Derived();
//    d.sun();

  }
}
