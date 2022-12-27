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
		System.out.println("getLogin");
		return "login";
	}
	 

	@GetMapping("/signUp")
	public String signUp(Model model) {
		System.out.println("get 됨?");
		model.addAttribute("userDto", new UserDTO());
		return "signUp";
	}
 
	@RequestMapping("/signUp")
	public String signUp(@ModelAttribute("userDto") UserDTO userDto) {
		System.out.println("post 됨?");
		userService.insert(userDto);
		return "redirect:/login";
	}
}