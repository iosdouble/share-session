package com.nh.share.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/service2")
public class WebController {
	
	@GetMapping("/getMsg")
	public String  getMsg(HttpSession session) {
		
		String msg=(String) session.getAttribute("msg");
		return msg;
	}
}

