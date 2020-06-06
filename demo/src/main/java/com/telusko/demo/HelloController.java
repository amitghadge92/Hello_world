package com.telusko.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.demo.model.Alien;

/**
 * @author amit
 *
 */
@RestController
public class HelloController {

	@GetMapping("/api/aliens")
	public Alien getAllAlliens() {
		
		Alien a = new Alien();
		a.setId(1);
		a.setAname("Amit");
		
		return a;
	}
	
	/* TODO Add new method */
	
}
