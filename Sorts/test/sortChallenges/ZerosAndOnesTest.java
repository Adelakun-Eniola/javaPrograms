package sortChallenges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZerosAndOnesTest {
    @Test
    public void ArrayNumberTest(){
        //Given
        int [] array = {4,5,8,8,8,2,9};
        //When
        int [] newArray = ZerosAndOnes.ArrayNumber(array);
        //Check
        int [] expected = {0,1,0,0,0,0,1};
        assertArrayEquals(expected, newArray);
    }


}
