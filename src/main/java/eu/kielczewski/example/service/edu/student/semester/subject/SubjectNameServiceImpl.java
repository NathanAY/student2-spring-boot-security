package eu.kielczewski.example.service.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.SubjectName;
import eu.kielczewski.example.repository.edu.student.semester.subject.SubjectNameRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectNameServiceImpl implements SubjectNameService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final SubjectNameRepository subjectNameRepository;

    @Autowired
    public SubjectNameServiceImpl(SubjectNameRepository subjectNameRepository) {
        this.subjectNameRepository = subjectNameRepository;
    }

    @Override
    public Optional<SubjectName> getSubjectName(long id) {
        return subjectNameRepository.findOneById(id);
    }

    @Override
    public Collection<SubjectName> getAlSubjectNames() {
        return subjectNameRepository.findAll();
    }

    @Override
    public List<SubjectName> getAllBySemesterId(Long semesterId) {
        return subjectNameRepository.findAllBySemesterId(semesterId);
    }

    @Override
    public SubjectName create(SubjectName subjectName) {
        return subjectNameRepository.save(subjectName);
    }
}
