package eu.kielczewski.example.domain.edu.student.view.semester;

import eu.kielczewski.example.domain.edu.student.semester.Semester;
import eu.kielczewski.example.domain.edu.student.view.semester.subject.SubjectNameView;

import java.util.List;

public class SemesterView {

    private Long id;

    private String title;

    private Long groupId;

    private List<AdditionalTermsNameView> additionalTermsNames;

    private List<SubjectNameView> subjectNames;

    public SemesterView (Semester semester) {
        this.id = semester.getId();
        this.title = semester.getTitle();
        this.groupId = semester.getGroupId();
    }

    public List<AdditionalTermsNameView> getAdditionalTermsNames() {
        return additionalTermsNames;
    }

    public void setAdditionalTermsNames(List<AdditionalTermsNameView> additionalTermsNames) {
        this.additionalTermsNames = additionalTermsNames;
    }

    public List<SubjectNameView> getSubjectNames() {
        return subjectNames;
    }

    public void setSubjectNames(List<SubjectNameView> subjectNames) {
        this.subjectNames = subjectNames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
