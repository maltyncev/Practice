package s07.t01;

public class DriverValidator <T> implements Validator<Driver<T>> {

    @Override
    public boolean isValid(Driver<T> driver) {
        if (driver == null) {return false;}
        if (driver.getFirstName() == null) {return false;}
        if (driver.getPatronymic() == null) {return false;}
        if (driver.getLastName() == null) {return false;}
        if (driver.getDateOfBirth() == null) {return false;}
        if (driver.getLicenseSeries() == null) {return false;}
        if (driver.getLicenseNumber() == null) {return false;}
        if (driver.getDateOfIssue() == null) {return false;}
        else {return true;}
    }

}
