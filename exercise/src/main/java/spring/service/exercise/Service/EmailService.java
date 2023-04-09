package spring.service.exercise.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import spring.service.exercise.Entities.DTO.NotificationDTO;
import spring.service.exercise.Entities.Student;

import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String username;


    public void sendTo(String email,String title,String text){
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(email);
        sms.setFrom(username);
        sms.setReplyTo(username);
        sms.setSubject(title);
        sms.setText(text);
        javaMailSender.send(sms);

    }


}
