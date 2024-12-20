public class alphabetChecker{
	public static void main(String [] args){
		String input = "hello";
		
		System.out.println(letterAppears(input));
	}

	public static boolean letterAppears(String input){
		 System.out.println(input.length());
		char [] array = new char[input.length()];
		for (int index = 0; index < array.length; index++){
			if(input.charAt(index) == index+1)return true;
			
		}
		return false;
	}
}