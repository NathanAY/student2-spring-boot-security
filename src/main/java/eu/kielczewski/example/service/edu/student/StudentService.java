package eu.kielczewski.example.service.edu.student;

import eu.kielczewski.example.domain.edu.student.Student;

import java.util.Collection;
import java.util.Optional;

public interface StudentService {

    Optional<Student> getStudentById(long id);

//    Optional<Student> getStudentByEmail(String email);

    Collection<Student> getAllStudents();

    Student create(Student student);

}
