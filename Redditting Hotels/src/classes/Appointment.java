package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Appointment {

    private String patientName;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String assignedDoctor;

    public Appointment(String patientName, String userId, String appointmentDate, String appointmentTime, String assignedDoctor) {
        this.patientName = patientName;
        this.appointmentDate = createAppointmentDate(appointmentDate);
        this.appointmentTime = appointmentTime;
        this.assignedDoctor = assignedDoctor;
    }



    private LocalDate createAppointmentDate(String appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(appointmentDate, formatter);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", patientName, appointmentDate, appointmentTime, assignedDoctor);
    }

    public String getAssignedDoctor() {
        return assignedDoctor;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }
}
