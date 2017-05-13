package com.spring.dispatcher.servlet.test;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {

	@RequestMapping("/")
	public String showHome(HttpSession session){
		session.setAttribute("name", "Hello HTTPSession");
		System.out.println("Hi");
		return "index";
		
	}
	
}
