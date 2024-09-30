import java.util.Scanner;
public class StudentGrade{

public static void main(String... args){

Scanner scann = new Scanner(System.in);

System.out.print("How many student do you have in your class this term:  ");
int numberOfStudent = scann.nextInt();

System.out.println("How many subjects did each student take:  ");
int numberOfSubject = scann.nextInt();


int[][] grade = new int[numberOfStudent][numberOfSubject];

for(int index = 0; index < grade.length; index++){
	System.out.println("Entering score for student "+ grade[index]+1 );
	for(int secondIndex = 0; secondIndex < grade[0].length; index++){
		grade[index][secondIndex] = scann.nextInt();
	}
}

for(int index = 0; index < grade.length; index++){
	System.out.println("Entering score for student "+ grade[index] );
	for(int secondIndex = 0; secondIndex < grade[0].length; index++){
		System.out.print(grade[index][secondIndex] + " ");
	}
	System.out.println();
}






}
}






















/*
System.out.print("==============");
first forloop 
System.out.print("STUDENT ", "SUB", agrade[index] + " "  + "TOT", "AVE" + "POS" );
second loop
System.out.println("Student " grade[secondIndex] + " "  );

*/