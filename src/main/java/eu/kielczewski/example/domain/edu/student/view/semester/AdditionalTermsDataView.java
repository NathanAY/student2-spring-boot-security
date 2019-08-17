package eu.kielczewski.example.domain.edu.student.view.semester;

import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsData;
import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsName;

import javax.persistence.Column;

public class AdditionalTermsDataView {
    private Long id;

    private String result;

    private Long additionalTermsNameId;

    private Long studentId;

    public AdditionalTermsDataView(AdditionalTermsData additionalTermsName) {
        this.id = additionalTermsName.getId();
        this.result = additionalTermsName.getResult();
        this.additionalTermsNameId = additionalTermsName.getAdditionalTermsNameId();
        this.studentId = additionalTermsName.getStudentId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Long getAdditionalTermsNameId() {
        return additionalTermsNameId;
    }

    public void setAdditionalTermsNameId(Long additionalTermsNameId) {
        this.additionalTermsNameId = additionalTermsNameId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
