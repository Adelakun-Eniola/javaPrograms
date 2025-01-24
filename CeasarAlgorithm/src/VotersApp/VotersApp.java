package VotersApp;


import java.util.Scanner;

public class VotersApp {
    private static eApp app = new eApp();

    public static void main(String[] args) {
        contestants();
    }
//    public static void numberOfUsers(){
//        System.out.println("How Many Voters Are There::");
//    }


     public static void contestants(){
        String conteestants = """
                1. Adeleke
                2. Ogulu
                3.Balogun
                4.Adedeji
                """;
        printContestants(conteestants);
         mainMenu(input("Choose Your Contestant::::"));
     }

    public static void printContestants(String conteestants) {
        System.out.println(conteestants);
    }

    public static String input(String prompt){
        printContestants(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void mainMenu(String sc){
        createUserName();
    }

    private static void createUserName() {
        String name = input("Enter Your Name:");
        contestants();
    }


}
