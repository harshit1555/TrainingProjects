package com.cognizant.truyum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController 
{
	@RequestMapping("/")
	public String abc()
	{
		return "Hello World";
	}
}
