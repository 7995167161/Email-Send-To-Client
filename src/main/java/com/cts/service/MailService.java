package com.cts.service;

import javax.mail.MessagingException;
//this is an interface
public interface MailService {
	public void send(String toAddress,String fromAddress,String subject,String body) throws Exception;
	public void sendHtml(String toAddress,String fromAddress,String subject,String body) throws Exception;
}

