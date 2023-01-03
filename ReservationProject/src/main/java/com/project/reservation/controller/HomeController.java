package com.project.reservation.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class HomeController {
 
	@GetMapping({ "/", "/home" })
	public String home() {
		return "home";
	}
 
 
	@GetMapping("/home_user")
	public String home_user() {
		return "home_user";
	}
}