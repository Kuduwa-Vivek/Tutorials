package cast.springbootApi;

import cast.springbootApi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApiApplication  {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootApiApplication.class, args);
		MyController myController = new MyController();
		myController.requesthandler();
	}
}
