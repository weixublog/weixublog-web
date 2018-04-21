package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Controller
public class SampleController {

//	@RequestMapping("/index")
//	public String home() {
//		return "hello";
//	}

	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
}