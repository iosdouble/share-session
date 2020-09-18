package com.nh.share.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("service1")
public class WebController {
	
	@GetMapping("/setMsg")
	public String  getMsg(HttpSession session) {
		
		session.setAttribute("msg", "Hello SpringSession!");
		return "ok";
	}
}
