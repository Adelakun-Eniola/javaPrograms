package classes;

import java.util.Random;
import java.util.regex.Pattern;


public class User {


    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private int userId;

    public User(String firstName, String lastName, String email, String phoneNumber, String address,int userId) {
        validatePhoneNumber(phoneNumber);
        validateEmail(email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userId = generateId();
        this.userId = userId;
    }


    public int generateId() {
        Random random = new Random();
        return random.nextInt(1000) + 1000;
    }

    public int getUserId() {
        return userId;
    }

    public void setFirstName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        try {

            String stringPattern = ".*";
            if (!Pattern.matches(stringPattern, firstName)) {
                throw new IllegalArgumentException("Input must be a string.");
            }
            System.out.println("Valid input: " + firstName);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        try {

            String stringPattern = ".*";
            if (!Pattern.matches(stringPattern, firstName)) {
                throw new IllegalArgumentException("Input must be a string.");
            }
            System.out.println("Valid input: " + firstName);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return firstName;
    }

    private void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11){
            throw new IllegalArgumentException("Phone Number Should be 11 digit");
        }
        if (!phoneNumber.matches("^\\d+$")) {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
    }



    private String validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!Pattern.matches(emailRegex, email)) {
            return "Invalid email";
        }
        return email;
    }



    public String validateLastName(String lastName){
        try {

            String stringPattern = ".*";
            if (!Pattern.matches(stringPattern, lastName)) {
                throw new IllegalArgumentException("Input must be a string.");
            }
            System.out.println("Valid input: " + lastName);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return lastName;
    }

//    @Override
//    public String toString() {
//        return firstName + " " + lastName + " " + email + " " + phoneNumber + " " + address;
//    }
}