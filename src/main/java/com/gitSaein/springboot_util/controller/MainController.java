package com.gitSaein.springboot_util.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gitSaein.springboot_util.service.impl.EmailServiceImpl;

@RestController
public class MainController {

	@Autowired
	EmailServiceImpl emailService;
	
	@GetMapping("/mail")
	public String sendMail() {
		emailService.sendSimpleMsgMail();
		return "";
	}
}
