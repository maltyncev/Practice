package s07.t01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        DriverValidator driverValidator = new DriverValidator();
        GregorianCalendar dateOfBirth = new GregorianCalendar(1990, Calendar.APRIL, 15);
        GregorianCalendar dateOfIssue = new GregorianCalendar(2010, Calendar.AUGUST, 7);

        driver.setFirstName("Иван");
        driver.setPatronymic("Петрович");
        driver.setLastName("Смирнов");
        driver.setDateOfBirth(dateOfBirth);
        driver.setLicenseSeries(5917);
        driver.setLicenseNumber(118596);
        driver.setDateOfIssue(dateOfIssue);

        System.out.println(driverValidator.isValid(driver));
    }
}