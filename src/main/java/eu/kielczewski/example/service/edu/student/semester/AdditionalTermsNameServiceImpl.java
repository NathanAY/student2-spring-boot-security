package eu.kielczewski.example.service.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsName;
import eu.kielczewski.example.repository.edu.student.semester.AdditionalTermsNameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class AdditionalTermsNameServiceImpl implements AdditionalTermsNameService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final AdditionalTermsNameRepository additionalTermsNameRepository;

    @Autowired
    public AdditionalTermsNameServiceImpl(AdditionalTermsNameRepository additionalTermsNameRepository) {
        this.additionalTermsNameRepository = additionalTermsNameRepository;
    }

    @Override
    public Optional<AdditionalTermsName> getAdditionalTermsName(long id) {
        return additionalTermsNameRepository.findOneById(id);
    }

    @Override
    public List<AdditionalTermsName> getAdditionalTermsNameBySemesterId(Long semesterId) {
        return additionalTermsNameRepository.findAllBySemesterId(semesterId);
    }

    @Override
    public Collection<AdditionalTermsName> getAlAdditionalTermsName() {
        return additionalTermsNameRepository.findAll();
    }

    @Override
    public AdditionalTermsName create(AdditionalTermsName additionalTermsName) {
        return additionalTermsNameRepository.save(additionalTermsName);
    }
}
