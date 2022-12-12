package com.project.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.reservation.dto.UserDTO;
import com.project.reservation.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public ModelAndView SelectAllFromUser() {
		ModelAndView mav = new ModelAndView("test");
		List<UserDTO> userList = service.userList();
		mav.addObject("list",userList);
		return mav;
	}
	
	@RequestMapping("/login")
	public String UserLogin() {
		return "login";
	}
	
	@RequestMapping("/main")
	public String RequestLogin(UserDTO userinfo) {
		List<UserDTO> userList = service.userList();
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).getId().equalsIgnoreCase(userinfo.getId())
					&&userList.get(i).getPassword().equals(userinfo.getPassword())) {
				System.out.println("로그인 성공");
				return "main";
			}			
		}
		System.out.println("로그인 실패");
		return "login";
	}
	

}