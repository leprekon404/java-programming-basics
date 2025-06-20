package org.javaguru.student_anton_krivonogov.lesson_2.level_3;

import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double rad = scanner.nextDouble();
        double P = 2*3.14*rad;
        double S = 3.14 * (P*P);
        System.out.println("P = " + P);
        System.out.println("S = " + S);
    }
}
