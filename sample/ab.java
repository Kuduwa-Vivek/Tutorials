package sample;
//abstract class Animal{
//  public abstract void sound();
//}
//class cat extends Animal{
//  public void sound(){
//    System.out.println("Meow......");
//  }
//}
//class dog extends cat{
//  public void sound(){
//    System.out.println("Bhuo... Bhuo");
//  }
//}
//public class ab {
//  public static void main(String[] args) {
//    Animal A = new cat();
//    A.sound();
//
//    A = new dog();
//    A.sound();
//  }
//}


// Creating object of abstract class


abstract class MyAbstractClass{
  public abstract void abstractMethod();
}
 class Convert extends MyAbstractClass{
  @Override
  public void abstractMethod(){
    System.out.println("Implementation of object of abstract class");
  }
}

public class ab {
  public static void main(String[] args) {
   Convert obj = new Convert();
   obj.abstractMethod();
  }
}
