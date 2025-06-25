package org.javaguru.student_anton_krivonogov.lesson_3.level_2;

public class Car {
    String mark;
    String color;
    String price;

    Car(String mark, String color, String price){
        this.mark = mark;
        this.color = color;
        this.price = price;
    }

    public String getMark(){
        return mark;
    }

    public String getColor(){
        return color;
    }

    public String getPrice(){
        return price;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(String price){
        this.price = price;
    }
}
