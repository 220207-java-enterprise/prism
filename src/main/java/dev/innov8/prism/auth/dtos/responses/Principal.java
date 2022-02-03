package dev.innov8.prism.auth.dtos.responses;

import dev.innov8.prism.organization.Organization;

import javax.validation.constraints.NotBlank;

public class Principal {

    @NotBlank
    private String id;

    @NotBlank
    private String orgName;


    public Principal() {
        super();
    }

    public Principal(Organization org) {
        this.id = org.getId();
        this.orgName = org.getName();
    }

    public Principal(String id, String orgName) {
        this.id = id;
        this.orgName = orgName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Organization extractUser() {
        return new Organization(id, orgName);
    }

    @Override
    public String toString() {
        return "PrincipalResponse{" +
                "id='" + id + '\'' +
                ", orgName='" + orgName + '\'' +
                '}';
    }

}
