package com.example.NightTimeTemperature.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	 @RequestMapping(value = "test-hello")
	    public String hello(){
	        return "Hello world";
	    }
}
