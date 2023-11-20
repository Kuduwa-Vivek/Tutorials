package spring.applicationcontext;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoOfApplicationContext {
  public static void main(String[] args) {
    ApplicationContext context = (ApplicationContext) SpringApplication.run(DemoOfApplicationContext.class, args);
    Student student = (Student) context.getContext(String.valueOf(Student.class));
    System.out.println(student);
  }
}
