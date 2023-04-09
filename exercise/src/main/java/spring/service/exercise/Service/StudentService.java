package spring.service.exercise.Service;

import org.springframework.stereotype.Service;
import spring.service.exercise.Entities.DTO.NotificationDTO;
import spring.service.exercise.Entities.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


  static List<Student> students = Arrays.asList(
          new Student("1","Aldo", "Mancuso", "mancusoaldo8@gmail.com"),
          new Student("2","Paolo", "Cardio", "paolo.cardio@gmail.com"),
          new Student("3","Alessandro", "Magno", "Alessadnro.magno@gmail.com"),
          new Student("4","Pdor", "Kmer", "pdor.kmer@gmail.com")
  );


    public Student GetStudentById(String id){
      Optional<Student> studentFromList = students.stream().filter(student -> student.getId().equals(id)).findAny();
      if(studentFromList.isPresent()){
           return studentFromList.get();


      }return null;

    }


}
