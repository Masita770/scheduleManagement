package com.example.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.DemoInfo;
import com.example.service.DemoService;


@Controller
//@RestController
public class DemoController {
	
	@Autowired
	DemoService service;

	@RequestMapping("/list")
	public String list(Model model) {
		List<DemoInfo> users = service.getDemoList();
		//List<DemoInfo> users = new ArrayList<DemoInfo>();
		//DemoInfo info = new DemoInfo();
		//info.set
//		users.add(new DemoInfo(1, "横縞", 31));
//		users.add(new DemoInfo(2, "八島", 27));
//		users.add(new DemoInfo(3, "美月", 41));
		
		model.addAttribute("list", users);
		model.addAttribute("demoInfo", new DemoInfo());
		return "/list";
	}
	@GetMapping("form")
	String newUser(@RequestBody(required = false) Model model) {
			return "/form";
	}
	//新規登録依頼の受け取り
	@PostMapping("/form")
	public String add(@ModelAttribute DemoInfo demoInfo, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
		List<DemoInfo> users = service.getDemoList();
		model.addAttribute("list", users);
		model.addAttribute("demoInfo", demoInfo);
		return "/list";
		}
	
	service.create(demoInfo);
	return "redirect:/list";
	}
}