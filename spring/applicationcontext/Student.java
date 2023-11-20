package spring.applicationcontext;

public class Student {
  private int id;
  private String name;

  public Student(int id, String name){
    this.name=name;
    this.id=id;
  }

  public String toString(){
    return "Student { " + "id = " + id + " name = " + name + " }";
  }
}
