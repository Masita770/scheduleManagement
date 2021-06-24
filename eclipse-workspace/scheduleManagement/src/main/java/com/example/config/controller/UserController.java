package com.example.config.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.config.domain.UserInformation;
import com.example.config.service.UserCalculation;


@SpringBootApplication
@Controller
public class UserController {

	@Autowired
	UserCalculation userCalculation;
	
	@GetMapping("/topPage")
	public String topPage(Model model) {
		List<UserInformation> allDate = userCalculation.searchAll();
//		List<UserInformation> allDate = new ArrayList();
//		UserInformation userInfo = new UserInformation();
//		userInfo.setId(59);
//		userInfo.setName("高橋");
//		allDate.add(userInfo);
		model.addAttribute("allDate", allDate);
		model.addAttribute("userInformation", new UserInformation());
		return "topPage";
	}
	
	@PostMapping("/topPage")
	public String createUser(@Valid UserInformation userInformation, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			List<UserInformation> allDate = userCalculation.searchAll();
			model.addAttribute("allDate", allDate);
			model.addAttribute("userInformation",userInformation);
			return "topPage";
		}
		
		userCalculation.addAccount(userInformation);
		return "redirect:/";
	}
}
