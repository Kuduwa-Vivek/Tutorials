package resources;

public abstract class Phone {
  public static void main(String[] args) {
    Iphone p = new Iphone();
    Samsung s = new Samsung();
    show(p);
  }
  public static void show(phone obj){
    obj.showConfig();
  }
}
 abstract class phone{
  public abstract void showConfig();
}
class Iphone extends phone{
  public void showConfig(){
    System.out.println("6GB Ram, IOS 17.3");
  }
}
class Samsung extends phone{
  public void showConfig(){
    System.out.println("8GBRam , Lollipop 20.20");
  }
}