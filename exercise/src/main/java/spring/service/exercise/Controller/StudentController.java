package spring.service.exercise.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.service.exercise.Entities.DTO.NotificationDTO;
import spring.service.exercise.Entities.Student;
import spring.service.exercise.Service.EmailService;
import spring.service.exercise.Service.StudentService;

import java.util.Optional;

@RestController
@RequestMapping("/notification")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    EmailService emailService;


    @PostMapping("/send")
    public ResponseEntity sendMailToStudent(@RequestBody NotificationDTO notificationDTO) {
        Student studentWhoSendMail = studentService.GetStudentById(notificationDTO.getId());
        if (studentWhoSendMail == null) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
            emailService.sendTo(studentWhoSendMail.getEmail(), notificationDTO.getTitle(), notificationDTO.getText());
            return ResponseEntity.status(HttpStatus.OK).build();
        }



    }










