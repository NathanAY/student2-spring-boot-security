package eu.kielczewski.example.service.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.Week;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface WeekService {

    Optional<Week> getWeek(long id);

    List<Week> getWeeksBySubjectId(Long id);

    Collection<Week> getAlWeeks();

    Week create(Week week);
}
