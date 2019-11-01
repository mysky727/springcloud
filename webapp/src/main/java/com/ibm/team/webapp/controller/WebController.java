package com.ibm.team.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ibm.team.webapp.service.UserService;

@Controller
public class WebController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showUser(Model model) {
		String name = userService.showUser();
		model.addAttribute("name", name);
		return "index";
	}
}