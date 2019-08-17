package eu.kielczewski.example.repository.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.SubjectName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubjectNameRepository extends JpaRepository<SubjectName, Long> {

    Optional<SubjectName> findOneById(long id);

    List<SubjectName> findAllBySemesterId(Long semesterId);
}