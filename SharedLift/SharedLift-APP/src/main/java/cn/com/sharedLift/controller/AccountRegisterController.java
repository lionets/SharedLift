package cn.com.sharedLift.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.sharedLift.service.IAccountRegisterService;

@Controller("registers")
public class AccountRegisterController {
	

	@Autowired
	private IAccountRegisterService registerService;
	
	@RequestMapping("/signup")
	public void signUp(HttpServletRequest request,HttpServletResponse response){
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			registerService.createAccountInfo(map);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}
	
}
