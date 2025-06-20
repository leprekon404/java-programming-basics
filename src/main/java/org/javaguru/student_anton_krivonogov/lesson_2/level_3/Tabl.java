package org.javaguru.student_anton_krivonogov.lesson_2.level_3;

import java.util.Scanner;

public class Tabl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int str = scanner.nextInt();
        for(int i = 0; i <= 10; i++) {
            System.out.println(str + " * " + i + " = " + (str * i));
        }

    }
}
