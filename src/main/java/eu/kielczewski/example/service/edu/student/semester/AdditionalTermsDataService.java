package eu.kielczewski.example.service.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsData;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AdditionalTermsDataService {

    Optional<AdditionalTermsData> getAdditionalTermsData(long id);

    Collection<AdditionalTermsData> getAlAdditionalTermsData();

    List<AdditionalTermsData> getAllByAdditionalTermsNameId(Long id);

    AdditionalTermsData create(AdditionalTermsData additionalTermsData);
}
