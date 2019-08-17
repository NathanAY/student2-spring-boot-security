package eu.kielczewski.example.service.edu.student;

import eu.kielczewski.example.domain.edu.student.Group;
import eu.kielczewski.example.repository.edu.student.GroupRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Optional<Group> getGroup(long id) {
        return groupRepository.findOneById(id);
    }

    @Override
    public List<Group> getAlGroups() {
        LOGGER.debug("Getting all users");
        return groupRepository.findAll();
    }

    @Override
    public Group create(Group group) {
        return groupRepository.save(group);
    }
}
