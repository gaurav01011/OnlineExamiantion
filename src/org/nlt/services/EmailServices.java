
package org.nlt.services;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import org.nlt.view.MainFrame;

public class EmailServices
{
    
      private static String fromEmail;
    private MainFrame mainFrame;


    //before writing this code copy mail.jar file in lib then
    //link in libray then after open your email id then find security option
    public void sendMail(String receiver, String text, String subject) {
        String to = receiver;//change accordingly

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return getPasswordAuthonticate();
            }
        });

        //compose message  
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("gauravthakare186@gmail.com"));//change accordingly  
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
            System.out.println("Email Sent Successfully");
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(mainFrame, "Can not send backup file on email", "Backup", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    private PasswordAuthentication getPasswordAuthonticate() {
        return new PasswordAuthentication("gauravthakare186@gmail.com", "Gaurav@123");//change accordingly  
    }
}

//Please make following changes in account by using following link
//https://www.google.com/settings/security/lesssecureapps
