package com.hackathon.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/getRequest")
	public String getRequest(){
		return "Hello User from Spring App !!!!";
	}
	
	@PostMapping("/postRequest")
	public String postRequest(@RequestParam String name){
		return "Hello " + name;
	}

}
