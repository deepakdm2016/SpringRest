package com.deepak.oauth.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@RequestMapping("/hello/{name}")
	public String home(@PathVariable("name")String name)
	{
		return "Hello "+ name;
		
	}


}
