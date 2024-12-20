package ArrayLengthChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayLengthChallengeTest {
    @Test
    public void testThatArrayElementMultiplies(){
        //Given
        int [] arrays ={4,5,8};
        //When
        arrays = ArrayLengthChallenge.multiplyElements(arrays);
        //Check
        int [] expected = {8,10,16};
        assertArrayEquals(expected, arrays);
    }

    @Test
    public void testThatArrayLengthContainsElementsAndProduct(){
        //Given
        int [] arrays = {4,5,8};
        int [] newLength = {4,5,8,0,0,0};
        //When
        ArrayLengthChallenge.newArray(arrays, newLength);
        //Check
        int [] expected = {4,5,8,8,10,16};
        assertArrayEquals(expected, newLength);
    }



}
