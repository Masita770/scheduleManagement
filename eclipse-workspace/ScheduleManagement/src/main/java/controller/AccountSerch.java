package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class AccountSerch {

	@Autowired
	GetInforamationService service;
	
	@RequestMapping("/userData")
	public String list() {
		List<GetInformation> list = service.getList();
		return list;
		
	}
}
