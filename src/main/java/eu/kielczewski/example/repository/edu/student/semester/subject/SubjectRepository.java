package eu.kielczewski.example.repository.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

    Optional<Subject> findOneById(long id);

    List<Subject> findAllBySubjectNameId(long id);
}