import java.util.Arrays;
public class SlidingArray{
	
	public static void main(String[] args){
		int[] testArray = {3,2,7,6,5,1,2,3,4};
		
		System.out.println(Arrays.toString(slide(testArray, 3)));
	}
	
	public static int[] slide(int[] arr, int k){
		int n = arr.length;
		int[] result = new int[n - k + 1];


		for (int i = 0; i <= n - k ; i++){	
			int largest = arr[i];

			for (int j = i; j < i + k; j++){
				if (arr[j] > largest){
					largest = arr[j];
				}
			}
			result[i] = largest;
		}
			return result;
		
	}

}