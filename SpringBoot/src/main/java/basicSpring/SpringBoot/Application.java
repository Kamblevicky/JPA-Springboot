package basicSpring.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		BinnarySearch binarysearch = new BinnarySearch(new BubbleSort());
		int result=binarysearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		//SpringApplication.run(Application.class, args);
	}

}
