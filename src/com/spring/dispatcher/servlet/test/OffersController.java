package com.spring.dispatcher.servlet.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {

	@RequestMapping("/")
	public String showHome(){
		System.out.println("Hi");
		return "index";
		
	}
	
}
