import java.util.Scanner;
public class indexTask{
	public static void main(String [] args){
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("How Many Scores Do You Want To Collect?");
	    int acceptedScores = scan.nextInt();
	    
	    final int LENGTH = acceptedScores;
	    int [] c =  new int[LENGTH];


	    int total = 0;
	    int average = 0;
	    int maxxNum = 0;
	    int minNum = 0;


	    for(int index =0; index< c.length; index++){
	        System.out.println("Entre A Numbre: ");
		
	        c[index] = scan.nextInt();
		
	        total = total + c[index];
	        average = total/2;  
	    
	    }
	    
	    
	    for(int index = 0; index < c.length; index++){
	    
	        System.out.println(c[index]);
		
		if(c[index] > maxxNum) maxxNum = c[index];
	    }
	
	    for(int jupyter=0; jupyter < c.length; jupyter++){
	    
	        if(c[jupyter] < maxxNum) minNum = c[jupyter];
	    
	    }
	    
	    System.out.println("Average is: "+ average);
	    System.out.println("highest is: " + maxxNum);
	    System.out.println("lowest is: " + minNum);
	    
  
	}


}