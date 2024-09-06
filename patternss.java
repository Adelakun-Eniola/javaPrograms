public class patternss{
	public static void main(String ... args){
	
		displaypattern(5);
	}
	public static void displaypattern(int n){
		for(int i = 1; i <= n; i++){
		for (int j=i; j>=1; j--){
			System.out.print(j + " ");
		}
		
	
		System.out.println();
	}

	
	}



}