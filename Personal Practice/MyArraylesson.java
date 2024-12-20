import java.util.*;
public class MyArraylesson{
	public static void main(String [] args){
		int [][] arr = new int [5][5];
		int count = 1;
		for(int index=0; index <arr.length; index++){
			
			for(int outdex = 0; outdex < arr.length; outdex++){
				arr[index][outdex] =  count;
				count  ++;
				System.out.print( arr[index] [outdex] + " \t");
				
			}
			System.out.println();
		}
	}

}