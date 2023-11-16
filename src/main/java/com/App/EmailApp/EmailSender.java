package com.App.EmailApp;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    public boolean sendEmail(String to,String form,String subject,String text){
        boolean flag = false;

        //SMTP propertiesgit

        Properties properties = new Properties();
        properties.put("mail.smtp.auth",true);
        properties.put("mail.smtp.starttls.eitnable",true);
        properties.put("mail.smtp.port",587);
        properties.put("mail.smtp.host","smtp.gmail.com");


        String username = "rajendrakhindkar321@gmail.com";
        String password = "spjsusboaplampne";

        //session

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }
        });

        try {

            Message message = new MimeMessage(session);

            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setFrom(new InternetAddress(form));
            message.setSubject(subject);
            message.setText(text);

            Transport.send(message);

            flag = true;

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return flag;
    }
}
