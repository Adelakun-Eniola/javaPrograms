import java.util.Arrays;
public class indexAss{
    public static void main(String [] args){

	





	//concatenateArray();


	//sumTotal();
	//returnsOdd();
	        
        /*System.out.println(largestNum());
	reverseNum();*/


	int [] input  = {5,4,4,5,5,7};
	
	int highest = input[0];
	for (int index = 0; index < input.length; index++){
		if (input[index] > highest) highest = input[index];
		
	}
	

	



    }






       /*public static int largestNum(){    
           int [] array = {1, 2000, 3, 409, 5, 56, 7, 8, 9, 10};
           
           int highest = array[0];
           for(int index = 0; index < array.length; index++){
	       
	      if(array[index] > highest) highest = array[index];
	   }
	   
	   return highest;
       
       } 


	public static void reverseNum(){
	    int trial [] = {1, 2,3,4,5,6,7,8,9,10};
	        for(int index = trial.length-1; index > 0; index--){
	            System.out.print(trial[index] + " ");
	        } 
        }*/



	/*
	public static void returnsOdd(){
	
	    int [] arr = {1,2,3,6,7,9,8,4,5,7};
	    

	    for(int index=0; index < arr.length; index = index++){
	        
	        if(index %2 != 0){
		    System.out.print(arr[index] + " ");
		}
		
	    }

		
		
	}*/






	/*
	public static void sumTotal(){
	
	    int [] sumCompute = {12,1,8,3,4,5,6,8,89,0};
	
	
	    int total = 0;
	    for(int index = 0; index < sumCompute.length; index++){
	        total = total+ sumCompute[index];
	    }
	    System.out.println(total);
	
	    
	    int total2 = 0;
	    int index2 = 0;
	    while(index2 < sumCompute.length){
	    
	        total2 = total2 + sumCompute[index2];
	        
	 	index2++;
	    
	    }
	    System.out.println(total2);
	
	
	
	    int total3 = 0;
	    int index3 = 0;

	    do{
	    
	        total3 = total3 + sumCompute[index3];
	        
	 	index3++;
		
		System.out.println(total3);

	    }
	    
	    while(index3 < sumCompute.length);
	
	}


	public static void concatenateArray(){
	    int [] numArray = {1,2,3,4};
	    int numLen = numArray.length;
	    int [] stringArray = {11, 12, 7};
	    int strLen = stringArray.length;
 	    int [] totalLength = new int[numArray.length + stringArray.length];

	
	    System.arraycopy(numArray, 0, totalLength, 0, numLen);
	    System.arraycopy(stringArray, 0, totalLength, numLen, strLen);


	    System.out.println(Arrays.toString(totalLength));

	

	}*/


}

	

