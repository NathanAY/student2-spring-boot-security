package eu.kielczewski.example.controller.edu.student;

import eu.kielczewski.example.domain.UserCreateForm;
import eu.kielczewski.example.domain.validator.UserCreateFormValidator;
import eu.kielczewski.example.service.edu.student.StudentService;
import eu.kielczewski.example.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.NoSuchElementException;

@Controller
public class StudentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;
    private final UserCreateFormValidator userCreateFormValidator;

    @Autowired
    public StudentController(StudentService studentService, UserCreateFormValidator userCreateFormValidator) {
        this.studentService = studentService;
        this.userCreateFormValidator = userCreateFormValidator;
    }

    @InitBinder("form")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(userCreateFormValidator);
    }

    @PreAuthorize("@currentUserServiceImpl.canAccessUser(principal, #id)")
    @RequestMapping("/student/{id}")
    public ModelAndView getStudentPage(@PathVariable Long id) {
        LOGGER.debug("Getting user page for user={}", id);
        return new ModelAndView("ude/student/student", "student", studentService.getStudentById(id)
                .orElseThrow(() -> new NoSuchElementException(String.format("Student=%s not found", id))));
//        return new ModelAndView("ude/student/student", "student", new NoSuchElementException(String.format("Student=%s not found", id)));
    }

//    @PreAuthorize("hasAuthority('ADMIN')")
//    @RequestMapping(value = "/user/create", method = RequestMethod.GET)
//    public ModelAndView getUserCreatePage() {
//        LOGGER.debug("Getting user create form");
//        return new ModelAndView("user_create", "form", new UserCreateForm());
//    }
//
//    @PreAuthorize("hasAuthority('ADMIN')")
//    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
//    public String handleUserCreateForm(@Valid @ModelAttribute("form") UserCreateForm form, BindingResult bindingResult) {
//        LOGGER.debug("Processing user create form={}, bindingResult={}", form, bindingResult);
//        if (bindingResult.hasErrors()) {
//            // failed validation
//            return "user_create";
//        }
//        try {
//            userService.create(form);
//        } catch (DataIntegrityViolationException e) {
//            // probably email already exists - very rare case when multiple admins are adding same user
//            // at the same time and form validation has passed for more than one of them.
//            LOGGER.warn("Exception occurred when trying to save the user, assuming duplicate email", e);
//            bindingResult.reject("email.exists", "Email already exists");
//            return "user_create";
//        }
//        // ok, redirect
//        return "redirect:/users";
//    }

}
