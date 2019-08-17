package eu.kielczewski.example.service.edu.student;

import eu.kielczewski.example.domain.edu.student.Group;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface GroupService {

    Optional<Group> getGroup(long id);

    List<Group> getAlGroups();

    Group create(Group group);
}
