package eu.kielczewski.example.service.edu.student;

import eu.kielczewski.example.domain.edu.student.Group;
import eu.kielczewski.example.domain.edu.student.Student;
import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsData;
import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsName;
import eu.kielczewski.example.domain.edu.student.semester.Semester;
import eu.kielczewski.example.domain.edu.student.view.semester.AdditionalTermsDataView;
import eu.kielczewski.example.domain.edu.student.view.semester.AdditionalTermsNameView;
import eu.kielczewski.example.domain.edu.student.view.semester.SemesterView;
import eu.kielczewski.example.domain.edu.student.view.semester.StudentsSemestersFullView;
import eu.kielczewski.example.domain.edu.student.semester.subject.Subject;
import eu.kielczewski.example.domain.edu.student.semester.subject.SubjectName;
import eu.kielczewski.example.domain.edu.student.semester.subject.Week;
import eu.kielczewski.example.domain.edu.student.view.semester.subject.SubjectNameView;
import eu.kielczewski.example.domain.edu.student.view.semester.subject.SubjectView;
import eu.kielczewski.example.domain.edu.student.view.semester.subject.WeekView;
import eu.kielczewski.example.service.edu.student.semester.AdditionalTermsDataService;
import eu.kielczewski.example.service.edu.student.semester.AdditionalTermsNameService;
import eu.kielczewski.example.service.edu.student.semester.SemesterService;
import eu.kielczewski.example.service.edu.student.semester.subject.SubjectNameService;
import eu.kielczewski.example.service.edu.student.semester.subject.SubjectService;
import eu.kielczewski.example.service.edu.student.semester.subject.WeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsSemestersFullViewService {

    private final GroupService groupService;
    private final StudentService studentService;
    private final SemesterService semesterService;
    private final AdditionalTermsNameService additionalTermsNameService;
    private final AdditionalTermsDataService additionalTermsDataService;
    private final SubjectService subjectService;
    private final SubjectNameService subjectNameService;
    private final WeekService weekService;

    @Autowired
    public StudentsSemestersFullViewService(GroupService groupService,
                                            StudentService studentService,
                                            SemesterService semesterService,
                                            AdditionalTermsNameService additionalTermsNameService,
                                            AdditionalTermsDataService additionalTermsDataService,
                                            SubjectService subjectService,
                                            SubjectNameService subjectNameService,
                                            WeekService weekService) {
        this.groupService = groupService;
        this.studentService = studentService;
        this.semesterService = semesterService;
        this.additionalTermsNameService = additionalTermsNameService;
        this.additionalTermsDataService = additionalTermsDataService;
        this.subjectService = subjectService;
        this.subjectNameService = subjectNameService;
        this.weekService = weekService;
    }

    public StudentsSemestersFullView getByStudentId(final Long studentId) {
        final StudentsSemestersFullView view = new StudentsSemestersFullView();
        final Student student = studentService.getStudentById(studentId).get();
        view.setStudent(student);
        final Group group = groupService.getGroup(student.getGroupId()).get();
        view.setGroup(group);
        view.setSemesters(getFullSemestersInfo(semesterService.getSemestersByGroupId(group.getId())));
        return view;
    }

    private List<SemesterView> getFullSemestersInfo(final List<Semester> semesters) {
        final List<SemesterView> semesterViews = new ArrayList<>();
        for (final SemesterView semester : convertToView(semesters)) {
            final List<AdditionalTermsNameView> termsNames = convertToViewTermName(additionalTermsNameService
                    .getAdditionalTermsNameBySemesterId(semester.getId()));
            for (final AdditionalTermsNameView termsName: termsNames) {
                final List<AdditionalTermsDataView> termsData = convertToViewTermData(additionalTermsDataService
                        .getAllByAdditionalTermsNameId(termsName.getId()));
                termsName.setAdditionalTermsDataView(termsData.get(0));
            }
            semester.setAdditionalTermsNames(termsNames);
            final List<SubjectNameView> subjectNames = convertToViewSubjectName(subjectNameService
                    .getAllBySemesterId(semester.getId()));
            for (final SubjectNameView subjectName : subjectNames) {
                final SubjectView subject = convertToViewSubject(subjectService
                        .getAllBySubjectNameId(subjectName.getId()).get(0));
                subject.setWeeks(convertToViewWeek(weekService.getWeeksBySubjectId(subject.getId())));
                subjectName.setSubject(subject);
            }
            semester.setSubjectNames(subjectNames);
            semesterViews.add(semester);
        }
        return semesterViews;
    }

    private List<SemesterView> convertToView(final List<Semester> list) {
        return list.stream().map(SemesterView::new).collect(Collectors.toList());
    }

    private List<AdditionalTermsNameView> convertToViewTermName(final List<AdditionalTermsName> list) {
        return list.stream().map(AdditionalTermsNameView::new).collect(Collectors.toList());
    }

    private List<AdditionalTermsDataView> convertToViewTermData(final List<AdditionalTermsData> list) {
        return list.stream().map(AdditionalTermsDataView::new).collect(Collectors.toList());
    }

    private List<SubjectNameView> convertToViewSubjectName(final List<SubjectName> list) {
        return list.stream().map(SubjectNameView::new).collect(Collectors.toList());
    }

    private List<WeekView> convertToViewWeek(final List<Week> list) {
        return list.stream().map(WeekView::new).collect(Collectors.toList());
    }

    private SubjectView convertToViewSubject(final Subject list) {
        return new SubjectView(list);
    }

    private void testAllServices() {
        List<Group> groups = groupService.getAlGroups();
        Collection<Student> students = studentService.getAllStudents();
        Collection<Semester> semesters = semesterService.getAlSemesters();
        Collection<AdditionalTermsName> termsNames = additionalTermsNameService.getAlAdditionalTermsName();
        Collection<AdditionalTermsData> termsData = additionalTermsDataService.getAlAdditionalTermsData();
        Collection<SubjectName> subjectNames = subjectNameService.getAlSubjectNames();
        Collection<Subject> subjects = subjectService.getAlSubjects();
        Collection<Week> weeks = weekService.getAlWeeks();
    }
}
