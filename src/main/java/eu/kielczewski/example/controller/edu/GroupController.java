package eu.kielczewski.example.controller.edu;

import eu.kielczewski.example.controller.edu.student.StudentController;
import eu.kielczewski.example.domain.edu.student.Group;
import eu.kielczewski.example.domain.edu.student.Student;
import eu.kielczewski.example.domain.edu.student.view.GroupView;
import eu.kielczewski.example.service.edu.student.GroupService;
import eu.kielczewski.example.service.edu.student.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
public class GroupController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    private final StudentService studentService;
    private final GroupService groupService;

    @Autowired
    public GroupController(StudentService studentService, GroupService groupService) {
        this.studentService = studentService;
        this.groupService = groupService;
    }


    @PreAuthorize("@currentUserServiceImpl.canAccessUser(principal, #id)")
    @RequestMapping("/group/{id}")
    public ModelAndView getGroupPage(@PathVariable Long id) {
        LOGGER.debug("Getting user page for user={}", id);

        return new ModelAndView("ude/group", "groupView", getGroupView(id));
    }

    private GroupView getGroupView(Long id) {
        List<Student> list = new ArrayList<>();
        for (Student student : studentService.getAllStudents()) {
            if (student.getGroupId().equals(id)) {
                list.add(student);
            }
        }
        Group group = groupService.getGroup(id).orElseThrow(() -> new NoSuchElementException(String.format("Group=%s not found", id)));
        GroupView groupView = new GroupView();
        groupView.setFaculty(group.getFaculty());
        groupView.setId(group.getId());
        groupView.setNumber(group.getNumber());
        groupView.setSpeciality(group.getSpeciality());
        groupView.setStudents(list);
        return groupView;
    }
}
