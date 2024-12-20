import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChargesTest {
    @Test
    public void testThatUserEntersNumberOfHours(){
        //Given
        int hoursEntered = 12;
        //When
        double result = Charges.calculateCharges(hoursEntered);
        //Check
        int expectedAmount = 8;
        assertEquals(expectedAmount, result);
    }

   @Test
    public void testThatAdditionalChargeIsAddedToCharge(){
        //Given
        int numberOfHours = 13;
        //When
        double answer = Charges.checkForOddHours(numberOfHours);
        //Check
        double expected = 8.5;
        assertEquals(expected, answer);
    }

}
