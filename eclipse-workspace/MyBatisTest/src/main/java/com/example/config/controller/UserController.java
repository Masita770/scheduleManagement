package com.example.config.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.config.domain.UserInfo;
import com.example.config.service.UserService;


@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/topPage")
	public String topPage(Model model) {
		List<UserInfo> allDate = userService.searchAll();
//		List<UserInformation> allDate = new ArrayList();
//		UserInformation userInfo = new UserInformation();
//		userInfo.setId(59);
//		userInfo.setName("高橋");
//		allDate.add(userInfo);
		model.addAttribute("allDate", allDate);
		model.addAttribute("userInfo", new UserInfo());
		return "topPage";
	}
	
	@PostMapping("/topPage")
	public String createUser(@Valid UserInfo userInfo, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			List<UserInfo> allDate = userService.searchAll();
			model.addAttribute("allDate", allDate);
			model.addAttribute("userInfo",userInfo);
			return "topPage";
		}
		
		userService.addInfo(userInfo);
		return "redirect:/";
	}
	
	@PostMapping("/schedule")
	public String scheduleUser(@RequestParam(name = "id") Integer Id) {
		UserInfo updateUserInfo = userService.findById(Id);
		updateUserInfo.getSchedule();
		userService.addInfo(updateUserInfo);
		return "redirect:/";
	}
}

