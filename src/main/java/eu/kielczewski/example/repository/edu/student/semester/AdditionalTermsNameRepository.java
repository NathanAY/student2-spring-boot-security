package eu.kielczewski.example.repository.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AdditionalTermsNameRepository extends JpaRepository<AdditionalTermsName, Long> {

    Optional<AdditionalTermsName> findOneById(long id);

    List<AdditionalTermsName> findAllBySemesterId(long semesterId);
}