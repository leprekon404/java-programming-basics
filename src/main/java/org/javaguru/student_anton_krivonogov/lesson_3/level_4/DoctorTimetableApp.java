package org.javaguru.student_anton_krivonogov.lesson_3.level_4;

import java.util.Date;

public class DoctorTimetableApp {

    public static void main(String[] args) {

        DocAppointment appointment1 = new DocAppointment(
                "aaa","bbb", "debil",100
        );
        DocAppointment appointment2 = new DocAppointment(
                "aaa2","bbb2", "debil2",200
        );
        DocSchedule doc1 = new DocSchedule(
                "ivan", "ivanov", "lor", new Date("10.10.2004"), appointment1,appointment2
        );

        System.out.println(doc1.docFirstName);
        System.out.println(doc1.docLastName);
        System.out.println(appointment1.price);
    }
}
