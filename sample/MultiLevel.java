package sample;

// we are using no w Access Specifier

 class Phone{
   private int a = 5;

  protected void SwitchNO(){
    System.out.println(a);
    System.out.println("Switch No the Phone");
  }
}

class Sign extends Phone {
  void signup(){
    System.out.println("Sing Up with mail Id");
  }
}

public class MultiLevel {
  public static void main(String[] args) {
    Sign p = new Sign();
    p.SwitchNO();
    p.signup();
  }
}
