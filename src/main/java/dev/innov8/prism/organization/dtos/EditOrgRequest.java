package dev.innov8.prism.organization.dtos;

import dev.innov8.prism.employee.dtos.NewEmployeeRequest;

import java.util.List;

public class EditOrgRequest {

    private String orgName;
    private List<NewEmployeeRequest> orgEmployees;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public List<NewEmployeeRequest> getOrgEmployees() {
        return orgEmployees;
    }

    public void setOrgEmployees(List<NewEmployeeRequest> orgEmployees) {
        this.orgEmployees = orgEmployees;
    }

    @Override
    public String toString() {
        return "EditOrgRequest{" +
                "orgName='" + orgName + '\'' +
                ", orgEmployees=" + orgEmployees +
                '}';
    }

}
