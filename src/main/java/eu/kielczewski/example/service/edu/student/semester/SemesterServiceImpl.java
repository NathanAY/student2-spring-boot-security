package eu.kielczewski.example.service.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.Semester;
import eu.kielczewski.example.repository.edu.student.semester.SemesterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class SemesterServiceImpl implements SemesterService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final SemesterRepository semesterRepository;

    @Autowired
    public SemesterServiceImpl(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    @Override
    public Optional<Semester> getSemester(long id) {
        return semesterRepository.findOneById(id);
    }

    @Override
    public List<Semester> getSemestersByGroupId(Long groupId) {
        return semesterRepository.findAllByGroupId(groupId);
    }

    @Override
    public Collection<Semester> getAlSemesters() {
        return semesterRepository.findAll();
    }

    @Override
    public Semester create(Semester semester) {
        return semesterRepository.save(semester);
    }
}
