package com.project.reservation.controller;
 
import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.reservation.dao.UserRepository;
import com.project.reservation.service.CustomUserDetailsService;

import lombok.AllArgsConstructor;
 
@Controller
@AllArgsConstructor
public class HomeController {
 
	private final UserRepository userRepository;
	@GetMapping({ "/", "/home" })
	public String home() {
		return "home";
	}
 
 
	@GetMapping("/home_user")
	public String home_user(Model model, Principal principal) {
		model.addAttribute("username", userRepository.findOneById(principal.getName()).getName());
		return "home_user";
	}
}