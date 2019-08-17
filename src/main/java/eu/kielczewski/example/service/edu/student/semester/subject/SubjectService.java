package eu.kielczewski.example.service.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.Subject;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface SubjectService {

    Optional<Subject> getSubject(long id);

    Collection<Subject> getAlSubjects();

    List<Subject> getAllBySubjectNameId(Long id);

    Subject create(Subject subject);
}
