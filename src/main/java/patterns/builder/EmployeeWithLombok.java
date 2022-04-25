package patterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * Employee is a class with many parameters.
 * Here is an example if using Lombok for the Builder pattern
 */
@Getter
@ToString
@Builder
public class EmployeeWithLombok {
    @NonNull
    private final String firstName;
    @NonNull
    private final String secondName;
    @NonNull
    private final long employeeId;
    private final int yearOfBirth;
    @Builder.Default
    private final String registrationAddress = "No Address";

}
