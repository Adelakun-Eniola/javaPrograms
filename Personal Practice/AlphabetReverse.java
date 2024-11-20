import java.util.ArrayList;

public class AlphabetReverse {
    public static void main(String[] args) {
        String alpahabets = "abcdefghijklmnopqrstuvwxyz";
        String reversed = " ";
        for (int i = 0; i < alpahabets.length(); i++) {
            reversed = alpahabets.charAt(i) + reversed;
        }
        System.out.print(reversed + " ");
    }
}
