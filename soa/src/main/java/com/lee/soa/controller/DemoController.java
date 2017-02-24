package com.lee.soa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lee.soa.service.DemoService;

@Controller
@RequestMapping("demo")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		System.out.println("已经跳转到了页面啦 ！");
		String helloMessage = demoService.sayHello("likun");
		request.setAttribute("userName", helloMessage);
		return "demoPage";
	}
}
