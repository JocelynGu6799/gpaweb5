package cuz.gpaweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("mapper")
@CrossOrigin("*")
public class GpawebApplication {
	@GetMapping("/")
	public String Hello(){
		return "Hello Springboot";

	}


	public static void main(String[] args) {

		SpringApplication.run(GpawebApplication.class, args);
	}

}
