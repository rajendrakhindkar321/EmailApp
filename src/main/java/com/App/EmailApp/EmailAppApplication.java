package com.App.EmailApp;

public class EmailAppApplication {

	public static void main(String[] args) {

		EmailSender emailSender = new EmailSender();
		String text = "This is example mail send using gmail";
		String from = "rajendrakhindkar321@gmail.com";
		String subject = "sending mail using Gmail";
		String to = "rajendrakhindkar321@gmail.com";
		boolean b= emailSender.sendEmail(to,from,subject,text);

		if (b){
			System.out.println("Email is sent successfully");
		}
		else {
			System.out.println("There is problem in  sending mail");
		}

	}

}
