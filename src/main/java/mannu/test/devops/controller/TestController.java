package mannu.test.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "This is a test gradle endpoint for DevOps learning - edit 2";
	}
}
