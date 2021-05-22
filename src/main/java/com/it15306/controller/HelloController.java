package com.it15306.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String index() {
		return "hello";
	}
	
	@GetMapping("/hello-api")
	@ResponseBody
	public String helloApi()
	{
		return "Hello Ong học lại!";
	}
}
