package Springboot_Class.Springbootfirstproject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(new Book(1, "Mastering String 5.0", "Ranga Karanam"));
	}
}
