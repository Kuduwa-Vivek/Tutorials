package interfaces.compare;

import org.hibernate.engine.internal.Collections;

import java.util.ArrayList;
import java.util.List;

//class spring.applicationcontext.Student implements Comparable<spring.applicationcontext.Student>{
//
//  int age;
//  String name;
//  int Rollno;
//
//  spring.applicationcontext.Student(int age,int Rollno,String name){
//    this.age=age;
//    this.Rollno=Rollno;
//    this.name=name;
//  }
//
//  @Override
//  public int compareTo(spring.applicationcontext.Student st) {
//    if (age == st.age)
//    return 0;
//    else if (age>st.age)
//      return 1;
//    return -1;
//  }
//}


public class Comparble {
  public static void main(String[] args) {
    List<Student> data = new ArrayList<>();
    data.add(new Student(1,"Vivek",20));
    data.add(new Student(2,"Yash",21));
    data.add(new Student(3,"Subodh",22));
    for (Student st : data)
      System.out.println("RollNo : " + st.Rollno + "  Name : " + st.name + "  Age : " + st.age);
  }
}
