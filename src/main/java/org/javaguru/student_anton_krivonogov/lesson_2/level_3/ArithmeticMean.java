package org.javaguru.student_anton_krivonogov.lesson_2.level_3;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("2 число: ");
        int num2 = scanner.nextInt();

        System.out.print("3 число: ");
        int num3 = scanner.nextInt();

        double answ = (num1+num2+num3) / 3;

        System.out.println(answ);
    }

}
