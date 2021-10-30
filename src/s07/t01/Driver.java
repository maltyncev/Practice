package s07.t01;

import java.util.GregorianCalendar;

public class Driver<T> {
    private String firstName;
    private String patronymic;
    private String lastName;
    private GregorianCalendar dateOfBirth;
    private T licenseSeries;
    private Integer licenseNumber;
    private GregorianCalendar dateOfIssue;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public T getLicenseSeries() {
        return licenseSeries;
    }

    public void setLicenseSeries(T licenseSeries) {
        this.licenseSeries = licenseSeries;
    }

    public Integer getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public GregorianCalendar getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(GregorianCalendar dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
}