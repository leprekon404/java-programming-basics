package org.javaguru.student_anton_krivonogov.lesson_2.level_2;

import java.util.Scanner;

import static java.lang.System.in;

public class LoginService {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(in);
            System.out.print("Введите строку: ");
            String str = scanner.nextLine();
            System.out.println("Hello " + str);
            //System.out.println("You can login!");
        }


}
