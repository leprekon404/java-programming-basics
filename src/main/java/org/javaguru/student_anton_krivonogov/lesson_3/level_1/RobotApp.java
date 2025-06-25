package org.javaguru.student_anton_krivonogov.lesson_3.level_1;

public class RobotApp {
    public static void main(String[] args) {
        Robot r1 = new Robot("r1");
        Robot r2 = new Robot("r2");

        System.out.println(r1.getName());
        System.out.println(r2.getName());

        r1.setName("rob1");
        r2.setName("rob2");

        System.out.println(r1.getName());
        System.out.println(r2.getName());
    }
}
