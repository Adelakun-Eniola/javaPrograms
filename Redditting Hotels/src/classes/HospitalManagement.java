package classes;

import java.util.Scanner;

public class HospitalManagement  extends Reception{

    private static Reception reception = new Reception();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        main_menu(scanner);
    }

    private static void register_patient(Scanner scanner) {
        System.out.println("You are welcome to Redditon Hospital");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter your date of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter your occupation: ");
        String occupation = scanner.nextLine();
        System.out.print("Enter your type of illness: ");
        String typeOfIllness = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Your healing is our priority");
        reception.register_patient(firstName, lastName, dateOfBirth, gender, occupation, typeOfIllness, address, email, phoneNumber);
        main_menu(scanner);
    }

    private static void register_doctor(Scanner scanner) {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter your role: ");
        String role = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        reception.register_doctor(firstName, lastName, email, phoneNumber, role, address);
        main_menu(scanner);
    }

    private static void book_appointment(Scanner scanner) {
        System.out.print("Enter your user id: ");
        String userId = scanner.nextLine();
        System.out.print("Enter your appointment date: ");
        String appointmentDate = scanner.nextLine();
        System.out.print("Enter your appointment time: ");
        String appointmentTime = scanner.nextLine();
        System.out.print("Enter the assigned doctor: ");
        String assignedDoctor = scanner.nextLine();
        reception.book_appointment(userId, appointmentDate, appointmentTime, assignedDoctor);
        main_menu(scanner);
    }

    private static void get_patient_details(Scanner scanner) {
        System.out.print("Enter your patient id: ");
        String userId = scanner.nextLine();
        reception.get_patient_info(userId);
        main_menu(scanner);
    }

    private static void get_doctor_info(Scanner scanner) {
        System.out.print("Enter your doctor id: ");
        String userId = scanner.nextLine();
        reception.get_doctor_info(userId);
        main_menu(scanner);
    }

    private static void get_doctors(Scanner scanner) {
        reception.list_of_doctors();
        main_menu(scanner);
    }

    private static void main_menu(Scanner scanner) {
        String option = """
                1-> register patient
                2-> register doctor
                3-> book-appointment
                4-> patient details
                5-> doctor information
                6-> list of doctors
                """;
        System.out.println(option);
        System.out.print("Enter your option: ");
        String selectedOption = scanner.nextLine();

        switch (selectedOption) {
            case "1" -> register_patient(scanner);
            case "2" -> register_doctor(scanner);
            case "3" -> book_appointment(scanner);
            case "4" -> get_patient_details(scanner);
            case "5" -> get_doctor_info(scanner);
            case "6" -> get_doctors(scanner);
            default -> System.out.println("Invalid option. Please try again.");
        }
    }


}