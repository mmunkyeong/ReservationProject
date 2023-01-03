package com.project.reservation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.reservation.dto.UserDTO;
import com.project.reservation.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class LoginController {
	 
	private final UserService userService;
	 
	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		return "login";
	}
	@RequestMapping("/login")
	public String login() {
		return "redirect:/home_user";
	}

	@GetMapping("/signUp")
	public String signUp(Model model) {
		model.addAttribute("userDto", new UserDTO());
		return "signUp";
	}
 
	@RequestMapping("/signUp")
	public String signUp(@ModelAttribute("userDto") UserDTO userDto) {
		userService.insert(userDto);
		return "redirect:/login";
	}
}