package eu.kielczewski.example.domain.edu.student.semester;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "additional_terms_data")
public class AdditionalTermsData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "result")
    private String result;

    @Column(name = "additional_terms_name_id")
    private Long additionalTermsNameId;

    @Column(name = "student_id")
    private Long studentId;

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
