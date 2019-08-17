package eu.kielczewski.example.domain.edu.student.view.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.Week;

public class WeekView {

    private Long id;

    private Long attendedClasses;

    private Long totalClasses;

    private String completed;

    private Long subjectId;

    private String completedStr;

    public WeekView(Week week) {
        this.id = week.getId();
        this.attendedClasses = week.getAttendedClasses();
        this.totalClasses = week.getTotalClasses();
        this.completed = week.getCompleted();
        this.subjectId = week.getSubjectId();
        this.completedStr = completed == null ? ""
                : completed.split(",")[0].replace("л.р-","").substring(2);
    }

    public String getCompletedStr() {
        return completedStr;
    }

    public void setCompletedStr(String completedStr) {
        this.completedStr = completedStr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttendedClasses() {
        return attendedClasses;
    }

    public void setAttendedClasses(Long attendedClasses) {
        this.attendedClasses = attendedClasses;
    }

    public Long getTotalClasses() {
        return totalClasses;
    }

    public void setTotalClasses(Long totalClasses) {
        this.totalClasses = totalClasses;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }
}
