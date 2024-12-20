package CodeWarTest;

import CodeWar.CodeWar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CodeWarTest {
    @Test
    public void testThatTwoArraysMerge(){
        //Given
        int [] arrayOne = {1,2,3,4,5};
        int [] arrayTwo = {6,7,8,9,10};

        //WHen
        int [] Array = CodeWar.testMerge(arrayOne, arrayTwo);
        //Assert
        int [] expected = {1,6,2,7,3,8,4,9,5,10};
        assertArrayEquals(Array, expected);
    }
}
