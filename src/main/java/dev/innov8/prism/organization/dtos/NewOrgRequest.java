package dev.innov8.prism.organization.dtos;

import dev.innov8.prism.employee.Employee;
import dev.innov8.prism.employee.dtos.NewEmployeeRequest;
import dev.innov8.prism.organization.Organization;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewOrgRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String key;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Organization extractResource() {

        Organization newOrg = new Organization(name, key);
        newOrg.setName(name);
        newOrg.setKey(key);
        return newOrg;

    }

}
