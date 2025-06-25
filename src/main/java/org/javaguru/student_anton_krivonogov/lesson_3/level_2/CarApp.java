package org.javaguru.student_anton_krivonogov.lesson_3.level_2;


public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("m1", "red", "100");
        Car car2 = new Car("m2", "red", "100");
        Car car3 = new Car("m3", "red", "100");

        System.out.println("car1");
        System.out.println(car1.getMark());
        System.out.println(car1.getColor());
        System.out.println(car1.getPrice());

        System.out.println("car2");
        System.out.println(car2.getMark());
        System.out.println(car2.getColor());
        System.out.println(car2.getPrice());

        car3.setMark("m400");
        car3.setColor("m400");
        car3.setPrice("m400");

        System.out.println("car3");
        System.out.println(car3.getMark());
        System.out.println(car3.getColor());
        System.out.println(car3.getPrice());
    }
}
