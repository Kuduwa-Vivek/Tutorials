package spring.applicationcontext;

import org.springframework.context.annotation.Bean;

public class AppConfig {
  @Bean
  public Student student(){
    return new Student(1,"Vivek");
  }
}
