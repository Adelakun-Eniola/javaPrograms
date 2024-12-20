package Structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DayTwoTest {
    @Test
    public void testThatDuplicatedIsEliminated(){
        int [] array = {1,1,2};
        //When
        int [] answer ={1,2};
        int []result = DayTwo.removeDuplicate();
//        int ans = answer.length;

        assertArrayEquals(answer,result);
    }

}
