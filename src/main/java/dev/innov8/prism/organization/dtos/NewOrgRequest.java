package dev.innov8.prism.organization.dtos;

import dev.innov8.prism.employee.dtos.NewEmployeeRequest;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

public class NewOrgRequest {

    @NotBlank
    private String name;

    private List<NewEmployeeRequest> orgEmployees;

    public NewOrgRequest() {
        orgEmployees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NewEmployeeRequest> getOrgEmployees() {
        return orgEmployees;
    }

    public void setOrgEmployees(List<NewEmployeeRequest> orgEmployees) {
        this.orgEmployees = orgEmployees;
    }

}
