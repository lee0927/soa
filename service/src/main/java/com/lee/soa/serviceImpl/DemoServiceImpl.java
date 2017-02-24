package com.lee.soa.serviceImpl;

import com.lee.soa.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		System.out.println("hello,this is in prodiver service impl !!");
		return "hello "+name;
	}

}
