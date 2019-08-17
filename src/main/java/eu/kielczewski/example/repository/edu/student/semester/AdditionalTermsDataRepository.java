package eu.kielczewski.example.repository.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AdditionalTermsDataRepository extends JpaRepository<AdditionalTermsData, Long> {

    Optional<AdditionalTermsData> findOneById(long id);

    List<AdditionalTermsData> findAllByAdditionalTermsNameId(long id);
}