package Springboot_Class.Springbootfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringbootFirstProjectApplication.class, args);
		
		for(String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		
		Book b=new Book(1, "Master in Springboot 5.0", "Ranga Karanam");
		System.out.println(b);
	}

}
