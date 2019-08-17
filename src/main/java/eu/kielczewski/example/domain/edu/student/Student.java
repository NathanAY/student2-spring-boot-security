package eu.kielczewski.example.domain.edu.student;

import eu.kielczewski.example.domain.Role;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId", nullable = false, updatable = false)
    private Long studentId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "finishDate")
    private Date finishDate;

    @Column(name = "educationForm")
    @Enumerated(EnumType.STRING)
    private Role educationForm;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Role status;

    @Column(name = "facultyId")
    private long facultyId;

    @Column(name = "specialityId")
    private long specialityId;

    @Column(name = "groupId")
    private Long groupId;

    public Long getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public Role getEducationForm() {
        return educationForm;
    }

    public Role getStatus() {
        return status;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public long getSpecialityId() {
        return specialityId;
    }

    public Long getGroupId() {
        return groupId;
    }
}
