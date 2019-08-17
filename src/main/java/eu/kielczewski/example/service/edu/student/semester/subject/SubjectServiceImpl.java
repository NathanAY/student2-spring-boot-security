package eu.kielczewski.example.service.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.Subject;
import eu.kielczewski.example.repository.edu.student.semester.subject.SubjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Optional<Subject> getSubject(long id) {
        return subjectRepository.findOneById(id);
    }

    @Override
    public Collection<Subject> getAlSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public List<Subject> getAllBySubjectNameId(Long id) {
        return subjectRepository.findAllBySubjectNameId(id);
    }

    @Override
    public Subject create(Subject subject) {
        return subjectRepository.save(subject);
    }
}
