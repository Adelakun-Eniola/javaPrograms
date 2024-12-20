import java.util.Scanner;
public class centuryChecker{
	public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Year:");
	    int yearEntered = sc.nextInt();
	     
	   	
	   yearChecked(yearEntered); 
	 }
	public static void yearChecked(int yearEntered){
		//edString yearEntered2= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (yearEntered < 1){System.out.println("Century Never Existed");}
		if(yearEntered != yearEntered){System.out.println("Err");}
		    		

		if(yearEntered > 1  && yearEntered <=100){
		    System.out.println("1st century");
		}
		else if(yearEntered > 101  && yearEntered <=200){
		     System.out.println("2nd century");
		}
		else if(yearEntered > 201  && yearEntered <=300){
		     System.out.println("3rd century");
		}
		else if(yearEntered > 301  && yearEntered <=400){
		     System.out.println("4th century");
		}
		else if(yearEntered > 401  && yearEntered <=500){
		     System.out.println("5th century");
		}
		else if(yearEntered > 501  && yearEntered <=600){
		     System.out.println("6th century");
		}
		else if(yearEntered > 601  && yearEntered <=700){
		     System.out.println("7th century");
		}
		else if(yearEntered > 701  && yearEntered <=800){
		     System.out.println("8th century");
		}
		else if(yearEntered > 801  && yearEntered <=900){
		     System.out.println("9th century");
		}
		else if(yearEntered > 901  && yearEntered <=1000){
		     System.out.println("10th century");
		}
		else if(yearEntered > 1000  && yearEntered <=1100){
		     System.out.println("11th century");
		}
		else if(yearEntered > 1101  && yearEntered <=1200){
		     System.out.println("12th century");
		}
		else if(yearEntered > 1201  && yearEntered <=1300){
		     System.out.println("13 century");
		}
		else if(yearEntered > 1301  && yearEntered <=1400){
		     System.out.println("14th century");
		}
		else if(yearEntered > 1401  && yearEntered <=1500){
		     System.out.println("15th century");
		}
		else if(yearEntered > 1501  && yearEntered <=1600){
		     System.out.println("16th century");
		}
		else if(yearEntered > 1601  && yearEntered <=1700){
		     System.out.println("17th century");
		}
		else if(yearEntered > 1701  && yearEntered <=1800){
		     System.out.println("18th century");
		}
		else if(yearEntered > 1801  && yearEntered <=1900){
		     System.out.println("19th century");
		}
		else if(yearEntered > 1901  && yearEntered <=2000){
		     System.out.println("20th century");
		}
		else if(yearEntered > 2001  && yearEntered <=2100){
		     System.out.println("21st century");
		}
		if(yearEntered > 2100){
			System.out.println("CENTURY UNAVAILABLE JUST YET");
		}
		
	}

}