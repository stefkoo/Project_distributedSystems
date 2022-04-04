package de.hs.example.demo;
//Test
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class Hello {
	@RequestMapping("/hello")
	String greeting(){
		return "Hello Esslingen SS22";
	}



	@GetMapping("/employees/{id}")
	@ResponseBody
	public String getEmployeesById(@PathVariable String id) {
		return "ID: " + id;
	}
}

