package pl.siwiec.greetings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Greeter {

    @Test
    public void itGreetsUser() {
        //Arrange // Given
        String name = "Kacper";
        greetings greeter = new greetings();

        //Act // When
        String message = greeter.hello(name);

        //Assert // Then
        assertEquals("Hello Kacper", message);
    }
}