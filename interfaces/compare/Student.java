package interfaces.compare;

class Student implements Comparable<Student>{

  int age;
  String name;
  int Rollno;

  Student(int Rollno,String name,int age){
    this.age=age;
    this.Rollno=Rollno;
    this.name=name;
  }

  @Override
  public int compareTo(Student st) {
    if (age == st.age)
      return 0;
    else if (age>st.age)
      return 1;
    return -1;
  }
}