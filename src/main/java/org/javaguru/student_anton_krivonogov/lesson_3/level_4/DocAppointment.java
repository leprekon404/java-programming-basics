package org.javaguru.student_anton_krivonogov.lesson_3.level_4;

public class DocAppointment {
    String patientFirstName;
    String patientLastName;
    String diagnosis;
    int price;

    DocAppointment(String patientFirstName, String patientLastName, String diagnosis, int price){
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.price = price;
    }

    public String getPatientFirstName(){
        return patientFirstName;
    }

    public String getPatientLastName(){
        return patientLastName;
    }

    public String getDiagnosis(){
        return diagnosis;
    }

    public int getPrice(){
        return price;
    }
}
