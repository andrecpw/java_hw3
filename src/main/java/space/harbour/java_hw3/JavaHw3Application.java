package space.harbour.java_hw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JavaHw3Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaHw3Application.class, args);
	}

	@GetMapping("/inbox/items")
	public String getInboxItems() {
		return "[{\"Items\": {\"id\": 123, \"status\": \"completed\"}}]";
	}

	@PostMapping("/inbox/items/{id}")
	public String updateInboxItem(@PathVariable("id") int id, @RequestBody Item item) {
		return "{id: " + item.getId() + ", status: " + item.getStatus() + "}";
	}

}