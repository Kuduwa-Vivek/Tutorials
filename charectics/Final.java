package charectics;
 class Fin{
  public final int a = 10;
  public int b = 10;
   public void fun(){
    System.out.println("VIVEK");
  }
}
class Derived extends Fin{
   public void fun(){
    System.out.println("VIVEK");
  }
}

public class Final {


  public static void main(String[] args) {
    Fin f = new Fin();
//    f.a++;
    f.fun();
    f.b++;
  }
}
