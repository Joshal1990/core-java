package com.java.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailAPISample {

	public static void main(String[] args) {
		String from = "johnpaul.r@isgn.com";
		String to = "johnpaul@chrisrose.com";

		final String username = "prism";
		final String password = "Welcome$456";



		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", "10.165.220.71");
		properties.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(properties,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					to));
			message.setSubject("this is the subject line...!!");
			message.setText("Hi!, this is sample email text from localhost...!!!");
			Transport.send(message);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
