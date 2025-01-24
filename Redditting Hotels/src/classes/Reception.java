package classes;

import java.util.ArrayList;
import java.util.List;

import static classes.Patient.userId;

public class Reception {

        private List<Patient> list_of_patients = new ArrayList<>();
        private List<Doctor> list_of_doctors = new ArrayList<>();
        private List<Appointment> list_of_appointments = new ArrayList<>();
        private Patient new_patient;
    private String patientName;

    public void register_doctor(String firstName, String lastName, String email, String phoneNumber, String role, String address) {
            Doctor new_doctor;
            new_doctor = new Doctor(firstName, lastName, email, phoneNumber, role, address,userId);
            list_of_doctors.add(new_doctor);
            System.out.println("You have been registered successfully");
            System.out.println("your id is : " + new_doctor.getUserId());
        }

        public void register_patient(String firstName, String lastName, String dateOfBirth, String gender, String occupation, String typeOfIllness, String address, String email, String phoneNumber) {
            new_patient = new Patient(firstName, lastName, dateOfBirth, gender, occupation, typeOfIllness, address, email, phoneNumber);
            list_of_patients.add(new_patient);
            System.out.println("You have been registered successfully");
            System.out.println("your id is : " + new_patient.getUserId());
        }

    public void book_appointment(String userId, String appointmentDate, String appointmentTime, String assignedDoctor) {
        if (validate_registration_of_patient(userId)) {
            Patient patient = findPatientById(userId);
            Appointment new_appointment = new Appointment(patientName, userId, appointmentDate, appointmentTime, assignedDoctor);
            list_of_appointments.add(new_appointment);
            System.out.println("appointment has been booked successfully");
            System.out.println("your appointment date is:" + new_appointment.getAppointmentDate());
        } else {
            System.out.println("you need to register to continue");
        }
    }

    private Patient findPatientById(String userId) {
        for (Patient patient : list_of_patients) {
            if (Integer.parseInt(patient.getPatientId()) == Integer.parseInt(userId)) {
                return patient;
            }
        }
        return null;
    }

    public String get_patient_info(String patientId) {
        try {
            int intPatientId = Integer.parseInt(patientId);
            for (Patient patient : list_of_patients) {
                if (patient.getUserId() == intPatientId) {
                    return patient.toString();
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid patient ID format.");
        }
        return null;
    }

        public String get_doctor_info(String doctorId) {
            try {
                int intPatientId = Integer.parseInt(doctorId);
                for (Patient patient : list_of_patients) {
                    if (patient.getUserId() == intPatientId) {
                        return patient.toString();
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid patient ID format.");
            }
            return null;
        }

        public void get_list_of_patients() {
            for (Patient patient : list_of_patients) {
                System.out.println(patient.toString());
            }
        }

        public void get_list_of_doctors() {
            for (Doctor doctor : list_of_doctors) {
                System.out.println(doctor.toString());
            }
        }

    private boolean validate_registration_of_patient(String userId) {
        for (Patient patient : list_of_patients) {
            if (patient.getPatientId() == userId) {
                return true;
            }
        }
        return false;
    }

        public void list_of_doctors() {
            List<Doctor> list_of_doctors = new ArrayList<>();
        }
    }

