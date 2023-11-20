package resourceAB;


 abstract class suresh{
  public void call(){
    System.out.println("Calling...");
  }
  public abstract void dance();
  public abstract void Cook();
  public abstract void Move();
}

abstract class mahesh extends suresh{
   public void Move(){
     System.out.println("Moving");
   }
}
class ramesh extends mahesh{
   public void Cook(){
     System.out.println("Cooking..");
   }
   public void dance(){
     System.out.println("Dancing..");
   }
 }

public class demo {
  public static void main(String[] args) {
      suresh s = new ramesh();
        s.call();
        s.Cook();
        s.dance();
        s.Move();
  }
}
