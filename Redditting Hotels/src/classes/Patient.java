package classes;

import java.time.LocalDate;

public class Patient extends User {

    static final int userId = 0;
    private static int patientId;
    private String dateOfBirth;
    private String gender;
    private String occupation;
    private String typeOfIllness;
    private LocalDate creationDate;


    public Patient(int patientId, String firstName, String lastName, String email, String phoneNumber, String address, String dateOfBirth, String gender, String occupation, String typeOfIllness) {
        super(firstName, lastName, email, phoneNumber, address, userId);
        this.patientId = patientId;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.occupation = occupation;
        this.typeOfIllness = typeOfIllness;
        this.creationDate = LocalDate.now();
    }


//    public void Patient(String firstName, String lastName, String email, int phoneNumber, String address, int userId) {
//        super(firstName, lastName, email, phoneNumber, address, userId);
//    }

//    public Patient(String firstName, String lastName, String email, String phoneNumber, String address, int userId) {
//        super(firstName, lastName, email, phoneNumber, address, userId);
//    }

    public Patient(String firstName, String lastName, String dateOfBirth, String gender, String occupation, String typeOfIllness, String address, String email, String phoneNumber) {

        super(firstName, lastName, email, phoneNumber, address, userId);
    }


    public String getFullName() {
        return super.getFirstName() + " " + super.getLastName();
    }


    public static String getPatientId() {
        return String.valueOf(patientId);
    }

//    public void registerUser(){
//
//    }




}
