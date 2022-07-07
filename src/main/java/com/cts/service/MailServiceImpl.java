package com.cts.service;

import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void send(String toAddress, String fromAddress, String subject, String body) throws Exception  {
	MimeMessage mimeMessage=javaMailSender.createMimeMessage();
	MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage);
	mimeMessageHelper.setFrom(fromAddress);
	mimeMessageHelper.setTo(toAddress);
	mimeMessageHelper.setSubject(subject);
	mimeMessageHelper.setText(body);
	mimeMessageHelper.setSentDate(new Date());
	javaMailSender.send(mimeMessage);
	}

	@Override
	public void sendHtml(String toAddress, String fromAddress, String subject, String body) throws Exception {
		// TODO Auto-generated method stub
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage);
		mimeMessageHelper.setFrom(fromAddress);
		mimeMessageHelper.setTo(toAddress);
		mimeMessageHelper.setSubject(subject);
		mimeMessageHelper.setText(body,true);
		mimeMessageHelper.setSentDate(new Date());
		javaMailSender.send(mimeMessage);
		}
	}


