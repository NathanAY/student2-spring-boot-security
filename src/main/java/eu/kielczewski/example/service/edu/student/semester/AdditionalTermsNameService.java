package eu.kielczewski.example.service.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsName;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AdditionalTermsNameService {

    Optional<AdditionalTermsName> getAdditionalTermsName(long id);

    List<AdditionalTermsName> getAdditionalTermsNameBySemesterId(Long semesterId);

    Collection<AdditionalTermsName> getAlAdditionalTermsName();

    AdditionalTermsName create(AdditionalTermsName additionalTermsName);
}
