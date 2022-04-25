package patterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeWithLombokTest {

    private final String firstName = "Name";
    private final String secondName = "Surname";
    private final long employeeId = 123456;
    private final int yearOfBirth = 1999;
    private final String registrationAddress = "Dnipro, Ukraine";

    @Test
    public void testBuildEmployeeWithLombok() {
        EmployeeWithLombok testEmployee = EmployeeWithLombok.builder()
                                                            .firstName(firstName)
                                                            .secondName(secondName)
                                                            .employeeId(employeeId)
                                                            .yearOfBirth(yearOfBirth)
                                                            .registrationAddress(registrationAddress)
                                                            .build();

        assertNotNull(testEmployee);
        assertNotNull(testEmployee.toString());
        assertEquals(firstName, testEmployee.getFirstName());
        assertEquals(secondName, testEmployee.getSecondName());
        assertEquals(employeeId, testEmployee.getEmployeeId());
        assertEquals(yearOfBirth, testEmployee.getYearOfBirth());
        assertEquals(registrationAddress, testEmployee.getRegistrationAddress());
    }
}