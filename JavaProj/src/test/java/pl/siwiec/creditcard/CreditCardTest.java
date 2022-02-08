package pl.siwiec.creditcard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    @Test
    void itAllowsAssignLimitTOCC(){
        //Arrange
        CreditCard creditCard = new CreditCard("1234-5678");
        //Act
        creditCard.assignLimit(1000);
        //Asserts
        assertEquals(expected:1000, creditCard.getCreditLimit());
    }
}
