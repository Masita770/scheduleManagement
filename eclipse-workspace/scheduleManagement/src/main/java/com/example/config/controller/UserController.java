package com.example.config.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.config.service.UserCalculation;
import com.example.config.domain.UserInformation;


@SpringBootApplication
@Controller
public class UserController {

	@Autowired
	UserCalculation userCalculation;
	
	@GetMapping("/topPage")
	public String topPage(Model model) {
		List<UserInformation> allDate = userCalculation.searchAll();
		model.addAttribute("allDate", allDate);
		return "topPage";
	}
}
