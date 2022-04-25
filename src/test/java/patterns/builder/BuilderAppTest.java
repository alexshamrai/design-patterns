package patterns.builder;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class BuilderAppTest {

    @Test
    public void shouldExecuteApplicationWithoutException() {
        assertDoesNotThrow(() -> BuilderApp.main(new String[]{}));
    }
}
