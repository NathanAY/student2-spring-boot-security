package eu.kielczewski.example.domain.edu.student.view.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.SubjectName;

import javax.persistence.Column;

public class SubjectNameView {

    private Long id;

    private String name;

    private Long semesterId;

    private SubjectView subject;

    public SubjectNameView(SubjectName subjectname) {
        this.id = subjectname.getId();
        this.name = subjectname.getName();
        this.semesterId = subjectname.getSemesterId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Long semesterId) {
        this.semesterId = semesterId;
    }

    public SubjectView getSubject() {
        return subject;
    }

    public void setSubject(SubjectView subject) {
        this.subject = subject;
    }
}
