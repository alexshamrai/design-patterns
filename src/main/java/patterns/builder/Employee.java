package patterns.builder;

/**
 * Employee is a class with many parameters.
 */
public class Employee {
    private final String firstName;
    private final String secondName;
    private final int yearOfBirth;
    private final long employeeId;
    private final String registrationAddress;

    private Employee(Builder builder) {
        firstName = builder.firstName;
        secondName = builder.secondName;
        yearOfBirth = builder.yearOfBirth;
        employeeId = builder.employeeId;
        registrationAddress = builder.registrationAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
          .append(firstName)
          .append(" ")
          .append(secondName)
          .append(" id: ")
          .append(employeeId)
          .append(" Year of birth: ")
          .append(yearOfBirth)
          .append(" ")
          .append(" address: ")
          .append(registrationAddress);
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * The builder class.
     */
    public static class Builder {
        //Required fields
        private final String firstName;
        private final String secondName;
        private final long employeeId;

        //Optional fields may be initialized with default values
        private int yearOfBirth;
        private String registrationAddress = "No address";

        /**
         * Constructor.
         */
        public Builder(String firstName, String secondName, long employeeId) {
            if (firstName == null || secondName == null || employeeId == 0) {
                throw new IllegalArgumentException("firstName/secondName/employeeId should be set");
            }
            this.firstName = firstName;
            this.secondName = secondName;
            this.employeeId = employeeId;
        }

        public Builder yearOfBirth(int val) {
            this.yearOfBirth = val;
            return this;
        }

        public Builder registrationAddress(String val) {
            this.registrationAddress = val;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
