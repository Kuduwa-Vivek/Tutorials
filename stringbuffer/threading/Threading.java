package stringbuffer.threading;
class A extends Thread {
  public void run(){
    int num = 2;
    for (int i=0;i<=10;i++){
      System.out.println(num + " * " + i + " = " + num*i);
      try {
        Thread.sleep(1000);
      } catch (Exception e){
      } }
  }
}
class B extends Thread {
  public void run(){
    for (int i=0;i<10;i++){
      System.out.println("Update From ONE");
      try {
        Thread.sleep(1000);
      }catch (Exception e){}
    }
  }
}
class C extends Thread{
  public void run(){
    for (int i=0;i<10;i++){
      System.out.println("Update Successful");
      try {
        Thread.sleep(1000);
      }catch (Exception e){}
    }
  }
}
public class Threading {
  public static void main(String[] args) {
    A a = new A();
    a.start();
    B b = new B();
    b.start();
    C c = new C();
    c.run();
  }
}
