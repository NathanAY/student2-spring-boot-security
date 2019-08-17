package eu.kielczewski.example.repository.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.Week;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WeekRepository extends JpaRepository<Week, Long> {

    Optional<Week> findOneById(long id);

    List<Week> findAllBySubjectId(Long id);
}