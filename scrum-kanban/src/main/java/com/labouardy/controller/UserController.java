package com.labouardy.controller;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.labouardy.entity.User;
import com.labouardy.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public User constructUser(){
		return new User();
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String signUP(@ModelAttribute("user") User user, BindingResult result){
		if(result.hasErrors()){
			return "register";
		}
		userService.save(user);
		return "redirect:/register.html?success=true";
	}
	

	@RequestMapping("/board")
	public String home(Model model,Principal principal){
		int id_user=userService.findUserIdByName(principal.getName());
		model.addAttribute("id_user", id_user);
		return "board";
	}
}
