package dev.innov8.prism.employee.dtos;

import dev.innov8.prism.employee.AccountInfo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class NewEmployeeRequest {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    private String emailAddress;

    private AccountInfo accountInfo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "NewEmployeeRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", accountInfo=" + accountInfo +
                '}';
    }

}
