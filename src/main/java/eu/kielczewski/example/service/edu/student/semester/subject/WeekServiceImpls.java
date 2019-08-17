package eu.kielczewski.example.service.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.Week;
import eu.kielczewski.example.repository.edu.student.semester.subject.WeekRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class WeekServiceImpls implements WeekService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final WeekRepository weekRepository;

    @Autowired
    public WeekServiceImpls(WeekRepository weekRepository) {
        this.weekRepository = weekRepository;
    }

    @Override
    public Optional<Week> getWeek(long id) {
        return weekRepository.findOneById(id);
    }

    @Override
    public List<Week> getWeeksBySubjectId(Long id) {
        return weekRepository.findAllBySubjectId(id);
    }

    @Override
    public Collection<Week> getAlWeeks() {
        return weekRepository.findAll();
    }

    @Override
    public Week create(Week week) {
        return weekRepository.save(week);
    }
}
