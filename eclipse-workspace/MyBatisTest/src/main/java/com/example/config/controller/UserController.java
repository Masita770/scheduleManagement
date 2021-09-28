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
import org.springframework.validation.ObjectError;

import com.example.config.domain.UserInfo;
import com.example.config.service.UserService;
import com.example.config.dto.UserResponse;


@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	//DBから取得したデータをオブジェクトへ
	@GetMapping("/signs/list")
	public String gettopPage(Model model) {
		List<UserInfo> allDate = userService.getList();
//		List<UserInformation> allDate = new ArrayList();
//		UserInformation userInfo = new UserInformation();
//		userInfo.setId(59);
//		userInfo.setName("高橋");
//		allDate.add(userInfo);
		model.addAttribute("allDate", allDate);
		model.addAttribute("userInfo", new UserInfo());
		return "signs/list";
	}
	
	
	@GetMapping(value = "signs/topPage")
	public String displayAdd(Model model) {
		List<UserInfo> allDate = userService.getList();
		model.addAttribute("allDate", allDate );
		model.addAttribute("userInfo", new UserInfo());
		return "topPage";
	}
	
	@PostMapping("/")
	public String createUser(@Valid UserInfo userInfo, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			//List<UserInfo> errorList = userService.getList(); 
			List<String> errorList = new ArrayList<String>();
			//入力チェックエラーの記述を行った（21/9/21）
			for (ObjectError error : bindingResult.getAllErrors()) {
			//model.addAttribute("allDate", errorDate);
			//model.addAttribute("userInfo",userInfo);
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("validationError", errorList);
			return "signs/topPage";
		}
		
		userService.addInfo(userInfo);
		return "signs/topPage";
	}
	
	@PostMapping("/signs/[schedule]")
	public String scheduleUser(@RequestParam(name = "id") Integer Id) {
		UserInfo updateUserInfo = userService.findById(Id);
		updateUserInfo.getSchedule();
		userService.addInfo(updateUserInfo);
		return "redirect:/";
	}
}

