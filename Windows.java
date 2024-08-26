import java.util.*;
public class Windows{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("A Program To Check The Highest And Lowest Numbers:");
		System.out.println("Enter A Number:");
		int a = input.nextInt();
		
		System.out.println("Enter A Number:");
		int b = input.nextInt();

		System.out.println("Enter A Number:");
		int c = input.nextInt();

		System.out.println("Enter A Number:");
		int d = input.nextInt();

		System.out.println("Enter A Number:");
		int e = input.nextInt();

		if(a>b && a>c && a>d && a>e){
			System.out.println("The Max Number Is " + a);
		}
		else if(b>a && b>c && b>d && b>e){
			System.out.println("The Max NUmber Is " + b);
		}
		else if(c>a && c>b && c>d && c>e){
			System.out.println("The Max NUmber Is " + c);
		}
		else if(d>a && d>b && d>c && d>e){
			System.out.println("The Max NUmber Is " + d);
		}
		else if(e>a && e>b && e>c && e>d){
			System.out.println("The Max NUmber Is " + e);
		}


		if(a<b && a<c && a<d && a<e){
			System.out.println("The Min Number Is " +a);
		}
		else if(b<a && b<c && b<d && b<e){
			System.out.println("The Min NUmber Is " + b);
		}
		else if(c<a && c<b && c<d && c<e){
			System.out.println("The Min NUmber Is " + c);
		}
		else if(d<a && d<b && d<c && d<e){
			System.out.println("The Min NUmber Is " + d);
		}
		else if(e<a && e<b && e<c && e<d){
			System.out.println("The Min NUmber Is " + e);
		}


	}



}