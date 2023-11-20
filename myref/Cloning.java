package myref;

public class Cloning {
  public static void main(String[] args) throws CloneNotSupportedException {
    /*
    1. Shallow
    2. Deep
    3. Clone
     */
//    A obj = new A();
//    obj.i=5;
//    obj.j=6;
//    A obj1 = new A();
//    obj1.i = obj.i;
//    obj1.j = obj.j;
//    obj1.j = 9;
//    System.out.println(obj); // 5,6
//    System.out.println(obj1); // 5,9

    A obj = new A();
    obj.i=5;
    obj.j=7;

    A obj1 = (A) obj.clone();
    obj1.j=8;

    System.out.println(obj);
    System.out.println(obj1);
  }
}
class A implements Cloneable
{
  int i;
  int j;

  @Override
  public String toString(){
//    return "A{"+ "i="+ i + ",j=" + j +"}";
    return "A["+ "i=" + i + ",j=" + j + "]";
  }

  @Override
  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }

}
