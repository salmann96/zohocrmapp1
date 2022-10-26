package com.marketapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketapp.utilities.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	
	@RequestMapping("/sendEmail")
	private String sendEmail(@RequestParam("to") String to , @RequestParam("sub") String sub , @RequestParam("emailBody")String emailBody)  {
		emailService.sendEmail(to, sub, emailBody);
		return "compose_email";
		
	}
	
}
