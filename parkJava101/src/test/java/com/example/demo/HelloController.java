package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		
public class HelloController {
	
	@RequestMapping("/index/{name}")
	String hello(@PathVariable String name) {
		
		return "hello"+ name + "!";
	}

}
