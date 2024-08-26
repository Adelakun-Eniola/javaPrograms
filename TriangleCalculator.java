import java.util.*;
public class TriangleCalculator{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
		System.out.println("A Program To Calculate The Area And Volume Of An Equilteral Triangle");
		System.out.println("Please Enter The length Of The Side");
		double length = scanner.nextDouble();
		System.out.println("Please Enter The height Of The Side");
		double height = scanner.nextDouble();

		double Area = Math.sqrt(3)/4* length * length ;
		double Volume = Area * height;

		System.out.println("The Area Of The Triangle Is " + Area);
		System.out.println("The Volume Of The Triangle Is " + Volume );

	}





}