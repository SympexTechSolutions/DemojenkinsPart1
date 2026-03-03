package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Democontroller {	
	
	@GetMapping("/hi")
	public String message() {
		return "demo controller going on part1 , now i think im almost reacheable now , again im trying to get some features .... hello  .";
	}
}
