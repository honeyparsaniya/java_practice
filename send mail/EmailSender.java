import jakarta.mail.*;
import jakarta.mail.internet.*;
import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class EmailSender {

    public static void main(String[] args) {

        String host = "smtp.gmail.com";
        final String user = "honeyparsaniya@gmail.com";
        final String password = "grhtuzpnhfvkhdei";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
            new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user, password);
                }
            });

        try {
            String htmlContent = new String(
                    Files.readAllBytes(Paths.get("EMAIL.html"))
            );

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("raoshreepal@gmail.com"));

            message.setSubject("HTML Email from File");
            message.setContent(htmlContent, "text/html");

            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}