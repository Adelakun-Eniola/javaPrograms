package ArrayLengthChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringchallengeOneTest {
    @Test
    public void testThatUserEntersInput(){
        //Given
        String firstInput = "Eniola";
        String secondInput = "Joseph";
        //When
        String input = StringchallengeOne.acceptInput( firstInput, secondInput);
        //Check
        String expected = "Eniola Joseph" ;
        assertEquals(input, expected);
    }
    @Test
    public void testThatSumReturnStringSum(){
        //When
        String firstInput = "Eniola";
        String secondInput = "Joseph";

        int firstLength = firstInput.length();
        int secondLength = secondInput.length();
        //GIven
        int total = StringchallengeOne.checkSum(firstInput, secondInput);
        //Check
        int expected = 12;
        assertEquals(total, expected);
    }
}
