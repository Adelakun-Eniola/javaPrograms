package ArrayLengthChallenge;
import java.util.*;
public class StringchallengeOne {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String firstString = sc.nextLine();

        System.out.println("Enter Second String");
        String secondString = sc.nextLine();
        System.out.println(returnStringLength(firstString, secondString));

        public static int returnStringLength(String firstString, String secondString){
        int first = firstString.length();
        int second = secondString.length();

        int total = first+second;

        return total;
        }
         */
    }

    public static String acceptInput(String firstInput, String secondInput) {
        firstInput = "Eniola";
        secondInput = "Joseph";
        String result = firstInput + " " + secondInput;

        return result;
    }

    public static int checkSum(String firstInput, String secondInput) {
         firstInput = "Eniola";
         secondInput = "Joseph";

         int firstLength = firstInput.length();
         int secondLength = secondInput.length();

         int total = firstLength + secondLength;
        return total;
    }
}
