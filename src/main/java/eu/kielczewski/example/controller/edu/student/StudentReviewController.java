package eu.kielczewski.example.controller.edu.student;

import eu.kielczewski.example.domain.edu.student.view.semester.StudentsSemestersFullView;
import eu.kielczewski.example.service.edu.student.StudentsSemestersFullViewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@Controller
public class StudentReviewController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final StudentsSemestersFullViewService fullViewService;

    @Autowired
    public StudentReviewController(StudentsSemestersFullViewService fullViewService) {
        this.fullViewService = fullViewService;
    }

    @PreAuthorize("@currentUserServiceImpl.canAccessUser(principal, #id)")
    @RequestMapping("/review/{id}")
    public ModelAndView getStudentPage(@PathVariable Long id) {
        StudentsSemestersFullView fullView = fullViewService.getByStudentId(id);
        LOGGER.debug("Getting review page for user={}", id);
//        return new ModelAndView("ude/student/review", "student", new NoSuchElementException(String.format("Student=%s not found", id)));
        return new ModelAndView("ude/student/review", "view", fullView);
    }

}
