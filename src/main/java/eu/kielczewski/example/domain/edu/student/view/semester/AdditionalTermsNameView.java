package eu.kielczewski.example.domain.edu.student.view.semester;

import eu.kielczewski.example.domain.edu.student.semester.AdditionalTermsName;

public class AdditionalTermsNameView {

    private Long id;

    private String name;

    private String type;

    private Long semesterId;

    private AdditionalTermsDataView additionalTermsDataView;

    public AdditionalTermsNameView(AdditionalTermsName additionalTermsName) {
        this.id = additionalTermsName.getId();
        this.name = additionalTermsName.getName();
        this.type = additionalTermsName.getType();
        this.semesterId = additionalTermsName.getSemesterId();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Long semesterId) {
        this.semesterId = semesterId;
    }

    public AdditionalTermsDataView getAdditionalTermsDataView() {
        return additionalTermsDataView;
    }

    public void setAdditionalTermsDataView(AdditionalTermsDataView additionalTermsDataView) {
        this.additionalTermsDataView = additionalTermsDataView;
    }
}
