package com.nilesh.tuition.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class Samplecontroller {

	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
}
