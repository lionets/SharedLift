package cn.com.sharedLift.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("sharedLift")
public class SharedLiftController {
	
	@Autowired
	private  RedisTemplate<Serializable, Serializable> redisTemplate;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request){
		redisTemplate.opsForValue().set("redisValue", "SharedLiftProject");
		System.out.println(redisTemplate.opsForValue().get("devin").toString());
		return "index";
	}
	
	

}
