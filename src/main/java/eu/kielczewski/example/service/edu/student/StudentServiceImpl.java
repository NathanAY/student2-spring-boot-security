package eu.kielczewski.example.service.edu.student;

import eu.kielczewski.example.domain.edu.student.Student;
import eu.kielczewski.example.repository.edu.student.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> getStudentById(long id) {
        return studentRepository.findOneByStudentId(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        LOGGER.debug("Getting all users");
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }
}
