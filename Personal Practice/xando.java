import java.util.Arrays;
import java.util.Scanner;
public class xando {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        System.out.println("Choose An Alphabet:");
        String playerOne = input.nextLine();

        System.out.println("Choose An Alphabet:");
        String playerTwo = input.nextLine();

        System.out.println("Player One is " + playerOne);
        System.out.println("Player Two Is " + playerTwo);

        /*int[][] array = new int [3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

            }
            System.out.println();
        }*/

        System.out.println("Enter Position:");
        int position = input.nextInt();

    }

}
