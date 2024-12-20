
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArraySortTest{

	

	@Test
	public void testArrange(){
	     ArraySort array = new ArraySort();
	     int[] newArray = {1,2,3};
	     assertEquals(1, array.sortNumbers(newArray));
	}

	@Test
	public void testLargest(){
		int[] myArray = {3,5,1,9,4};
		ArraySort arr= new ArraySort();
		int largest = arr.findLargest(myArray);
		assertEquals(9, largest);
	}
}