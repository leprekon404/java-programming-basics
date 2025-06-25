package org.javaguru.student_anton_krivonogov.lesson_3.level_7;

public class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return radius*radius*Math.PI;
    }
}

class CircleDemo{
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        System.out.println(circle1.calculateArea());
    }
}
