package eu.kielczewski.example.service.edu.student.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.SubjectName;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface SubjectNameService {

    Optional<SubjectName> getSubjectName(long id);

    Collection<SubjectName> getAlSubjectNames();

    List<SubjectName> getAllBySemesterId(Long semesterId);

    SubjectName create(SubjectName subjectName);
}
