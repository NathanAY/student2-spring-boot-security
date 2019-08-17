package eu.kielczewski.example.repository.edu.student;

import eu.kielczewski.example.domain.edu.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findOneByStudentId(long studentId);
}
