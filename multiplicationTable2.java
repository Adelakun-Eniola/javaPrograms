public class multiplicationTable2{
	public static void main(String [] args){
	
		for(int count = 1; count <= 9; count++){
			System.out.println();
			for(int counter = 1; counter <= 9; counter++){
				System.out.printf("%d * %d =  %d", counter, count, counter* count );
			}
		}
	}


}