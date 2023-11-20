package myref;
class Human{
  private int age;
  private String name;

  public Human()
  {
    this.age = age;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
public class Constructor {
  public static void main(String[] args) {
    Human obj = new Human();
    obj.setAge(20);
    obj.setName("Vivek");
    System.out.println(obj.getName() + " : " + obj.getAge());
  }
}
