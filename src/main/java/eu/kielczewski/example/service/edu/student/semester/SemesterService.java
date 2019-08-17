package eu.kielczewski.example.service.edu.student.semester;

import eu.kielczewski.example.domain.edu.student.semester.Semester;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface SemesterService {

    Optional<Semester> getSemester(long id);

    List<Semester> getSemestersByGroupId(Long groupId);

    Collection<Semester> getAlSemesters();

    Semester create(Semester group);
}
