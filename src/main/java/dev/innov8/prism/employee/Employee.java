package dev.innov8.prism.employee;

import dev.innov8.prism.organization.Organization;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    private String id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", unique = true, nullable = false)
    private String emailAddress;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Organization organization;

    @Embedded
    private AccountInfo bankInfo;

    @Column(nullable = false)
    private boolean active;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public AccountInfo getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(AccountInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return active == employee.active && Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(emailAddress, employee.emailAddress) && Objects.equals(organization, employee.organization) && Objects.equals(bankInfo, employee.bankInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, emailAddress, organization, bankInfo, active);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", organization=" + organization +
                ", bankInfo=" + bankInfo +
                ", active=" + active +
                '}';
    }

}
