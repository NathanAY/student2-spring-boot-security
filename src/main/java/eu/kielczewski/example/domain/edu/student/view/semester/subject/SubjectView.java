package eu.kielczewski.example.domain.edu.student.view.semester.subject;

import eu.kielczewski.example.domain.edu.student.semester.subject.Subject;

import java.util.List;

public class SubjectView {

    private Long id;

    private String completed;

    private String result;

    private Long subjectNameId;

    private Long studentId;

    private List<WeekView> weeks;

    private Long rating;

    public SubjectView(Subject subject) {
        this.id = subject.getId();
        this.completed = subject.getCompleted();
        this.result = subject.getResult();
        this.subjectNameId = subject.getSubjectNameId();
        this.studentId = subject.getStudentId();
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Long getSubjectNameId() {
        return subjectNameId;
    }

    public void setSubjectNameId(Long subjectNameId) {
        this.subjectNameId = subjectNameId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public List<WeekView> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<WeekView> weeks) {
        this.weeks = weeks;

        int total = 0;
        int marks = 0;
        try {
            for (WeekView week : weeks) {
                if (week.getCompletedStr() != "") {
                    marks += Integer.parseInt(week.getCompletedStr());
                    total++;
                }
            }
        } catch (Exception e) {

        }
        if (total != 0) {
            this.rating = (long) marks / total;
        }
    }
}
