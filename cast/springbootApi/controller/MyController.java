package cast.springbootApi.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class MyController {
  @Bean
  public void requesthandler(){
    System.out.println("Don't worry I'm here to Handle your request..");
  }

//  public static void main(String[] args) {
//    MyController controller = new MyController();
//    controller.requesthandler();
//    System.out.println();
//  }
}
