package eu.kielczewski.example.repository.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SemesterRepository extends JpaRepository<Semester, Long> {

    Optional<Semester> findOneById(long id);

    List<Semester> findAllByGroupId(Long groupId);
}
