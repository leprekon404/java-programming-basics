package org.javaguru.student_anton_krivonogov.lesson_3.level_4;

import java.util.Date;

public class DocSchedule {
    String docFirstName;
    String docLastName;
    String speciality;
    Date dateReception;
    DocAppointment appointment1;
    DocAppointment appointment2;

    DocSchedule(String docFirstName, String docLastName, String speciality, Date dateReception, DocAppointment appointment1, DocAppointment appointment2){
        this.docFirstName = docFirstName;
        this.docLastName = docLastName;
        this.speciality = speciality;
        this.dateReception = dateReception;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }

    public String getDocFirstName(){
        return docFirstName;
    }
    public String getDocLastName(){
        return docLastName;
    }
    public String getSpeciality(){
        return speciality;
    }
    public Date getDateReception(){
        return dateReception;
    }
    public DocAppointment getAppointment1(){
        return appointment1;
    }
    public DocAppointment getAppointment2(){
        return appointment2;
    }
}
