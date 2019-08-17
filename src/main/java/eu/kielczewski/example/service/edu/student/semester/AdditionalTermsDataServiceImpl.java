package eu.kielczewski.example.service.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsData;
import eu.kielczewski.example.repository.edu.student.semester.AdditionalTermsDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class AdditionalTermsDataServiceImpl implements AdditionalTermsDataService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final AdditionalTermsDataRepository additionalTermsDataRepository;

    @Autowired
    public AdditionalTermsDataServiceImpl(AdditionalTermsDataRepository additionalTermsDataRepository) {
        this.additionalTermsDataRepository = additionalTermsDataRepository;
    }

    @Override
    public Optional<AdditionalTermsData> getAdditionalTermsData(long id) {
        return additionalTermsDataRepository.findOneById(id);
    }

    @Override
    public Collection<AdditionalTermsData> getAlAdditionalTermsData() {
        return additionalTermsDataRepository.findAll();
    }

    @Override
    public List<AdditionalTermsData> getAllByAdditionalTermsNameId(Long id) {
        return additionalTermsDataRepository.findAllByAdditionalTermsNameId(id);
    }

    @Override
    public AdditionalTermsData create(AdditionalTermsData additionalTermsData) {
        return additionalTermsDataRepository.save(additionalTermsData);
    }
}
