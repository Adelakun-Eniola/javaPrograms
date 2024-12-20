package Structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class DayOneTest {

    @Test
    public void testThatArrayIndexesSumReturnsAndEqualsToTarget(){
        int [] array = {2,7,11,15};
        int target = 9;
        int [] result = DayOne.returnIndex(array, target);
        assertArrayEquals(new int[]{0, 1},result);
    }
}
