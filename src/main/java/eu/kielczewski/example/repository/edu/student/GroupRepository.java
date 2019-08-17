package eu.kielczewski.example.repository.edu.student;

import eu.kielczewski.example.domain.edu.student.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {

    Optional<Group> findOneById(long id);
}
