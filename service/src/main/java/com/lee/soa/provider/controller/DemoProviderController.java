package com.lee.soa.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemoProviderController {
	@RequestMapping("/provider")
	public String provider(HttpServletRequest request){
		System.out.println("welcome to provider");
		request.setAttribute("prodiver", "provider likun!!");
		return "providerPage";
	}
}
