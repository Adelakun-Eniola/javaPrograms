package sortChallenges;
    import java.util.Scanner;

    public class AtmMachine {
        private static Bank bank = new Bank();

        public static void main(String[] args) {
            goToMainMenu();
        }

        public static void goToMainMenu() {
            String option = """
                    1->Create Account
                    2->Deposit Money
                    3->Withdraw Money
                    4->Transfer Money
                    5->Check Balance
                    6->Exit
                    """;
            display(option);
            mainMenu(input("Enter an option"));
        }

        private static void display(String display) {
            System.out.println(display);
        }

        private static String input(String prompt) {
            display(prompt);
            Scanner userInput = new Scanner(System.in);
            return userInput.nextLine();

        }

        public static void mainMenu(String userInput) {
            switch (userInput) {
                case "1":
                    createAccount();
                case "2":
                    deposit();
                case "3":
                    withdraw();
                case "4":
                    transfer();
                case "5":
                    checkBalance();
                case "6":
                    exitApp();
            }
        }

        private static void exitApp() {
            display("Thanks for banking with us");
            System.exit(49);
        }

        private static void checkBalance() {
            String accountNumber = input("Enter the account number");
            String pin = input("Enter the pin");
            bank.getBalance(accountNumber, pin);
            goToMainMenu();

        }

        private static void transfer() {
            String senderAccountNumber = input("Enter account number");
            String receiverAccountNumber = input("Enter account number");
            int amount = Integer.parseInt(input("Enter amount"));
            String pin = input("Enter pin");
            bank.transfer(senderAccountNumber, receiverAccountNumber, amount, pin);
            display("Transfer Successful");
            display(String.format("Balance is " + bank.searchAccount(senderAccountNumber).getBalance(pin)));

            goToMainMenu();

        }

        private static void withdraw() {
            String accountNumber = input("Enter account number");
            int amount = Integer.parseInt(input("Enter amount"));
            String pin = input("Enter pin");
            bank.withdraw(amount,accountNumber,pin);
            display("Withdraw Successful");
            display(("Balance is " + bank.searchAccount(accountNumber).getBalance(pin)));
            goToMainMenu();

        }

        private static void deposit() {
            try {
                String accountNumber = input("Enter account number");
                int amount = Integer.parseInt(input("Enter amount"));
                String pin = input("Enter pin");
                bank.deposit(amount, accountNumber);
                display("Deposit Successful");
                display(("Balance is " + bank.searchAccount(accountNumber).getBalance(pin)));
            } catch (RuntimeException e) {

            }
            goToMainMenu();

        }

        private static void  createAccount() {
            String name = input("Enter account name");
            String accountNumber = input("Enter account number");
            String pin = input("Enter pin");
            bank.createAccount(name,pin,accountNumber);
            display("Create Account Successful");
            goToMainMenu();
        }

    }