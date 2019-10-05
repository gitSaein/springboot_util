package com.gitSaein.springboot_util.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.gitSaein.springboot_util.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	public JavaMailSender mailSender;
	
	public void sendSimpleMsgMail() {
		
		SimpleMailMessage smmsg = new SimpleMailMessage();
		smmsg.setTo("eamil address");
		smmsg.setSubject("test");
		smmsg.setText("test text");
		mailSender.send(smmsg);
		
	}
	
}
