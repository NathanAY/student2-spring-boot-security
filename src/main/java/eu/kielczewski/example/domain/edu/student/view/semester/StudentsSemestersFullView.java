package eu.kielczewski.example.domain.edu.student.view.semester;

import eu.kielczewski.example.domain.edu.student.Group;
import eu.kielczewski.example.domain.edu.student.Student;

import java.util.List;

public class StudentsSemestersFullView {

    private Group group;
    private Student student;
    private List<SemesterView> semesters;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<SemesterView> getSemesters() {
        return semesters;
    }

    public void setSemesters(List<SemesterView> semesters) {
        this.semesters = semesters;
    }
}
