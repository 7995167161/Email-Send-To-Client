package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.service.MailService;

@SpringBootApplication
public class EmailSendToClientApplication implements CommandLineRunner{
	
	@Autowired
	private MailService mailService;
//main function
	public static void main(String[] args) {
		SpringApplication.run(EmailSendToClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			//mailService.send("mr.kailasam1999@gmail.com","kailasamvenky.1999@gmail.com","Spring-Project","how are you");
			mailService.sendHtml("mr.kailasam1999@gmail.com","kailasamvenky.1999@gmail.com","Spring-Project","<html><body><b><i>how are you</i></b></body></html>");
			System.out.println("Done");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
