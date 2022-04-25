package patterns.builder;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class BuilderApp {
    public static void main(String[] args) {

        final Logger logger = LoggerFactory.getLogger(BuilderApp.class);

        Employee paul = new Employee.Builder("Paul",
                                             "McCartney",
                                             1001)
                .build();
        logger.info(paul.toString());

        Employee john = new Employee.Builder("John",
                                             "Lennon",
                                             1002                                             )
                .yearOfBirth(1940)
                .registrationAddress("Liverpool, UK")
                .build();
        logger.info(john.toString());

        EmployeeWithLombok george = new EmployeeWithLombok.EmployeeWithLombokBuilder()
                .firstName("George")
                .secondName("Harrison")
                .employeeId(1003)
                .build();
        logger.info(george.toString());
    }
}
