import java.util.Arrays;
public class ArraySort{


	public int[] sortNumbers(int[] array){
		int[] testArray = new int[array.length];
		
		return array ;
	}

	public int findLargest(int[] array){
		int largest = array[0];

		for (int i = 0; i < array.length; i++){
			if (array[i] > largest){
				largest = array[i];
			}
		}
		
		return largest;
	}


}