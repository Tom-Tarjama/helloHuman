package com.codingdojo.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Human {
	@RequestMapping("/your_server")
	public String index(@RequestParam (value ="first_name", required=false) String firstNameParam, @RequestParam (value ="last_name", required=false) String lastNameParam, Model model){
		if(firstNameParam == null) {
			firstNameParam = "Human";
			lastNameParam = null;
		}
		model.addAttribute("firstName", firstNameParam);
		model.addAttribute("lastName", lastNameParam);
		return "index.jsp";
	}
}
