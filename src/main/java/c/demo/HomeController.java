package c.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String gethome() {
		return "welcomehome";
	}
	@PostMapping("/home")
	public String gethome2() {
		return "welcomehome2";
	}
	@GetMapping("/Student")
	public Student getstudent() {
		return new Student();
	}
	@PostMapping("/AddStudent")
	public Student addstudent2(@RequestBody Student s) {
		return s;
	}
}
