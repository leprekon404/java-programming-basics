package org.javaguru.student_anton_krivonogov.lesson_3.level_7;

public class Dog {
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    String golos(){
        return "My nickname is " + name;
    }

    void dr(){
        this.age = this.age + 1;
    }

    int dogAge(){
        return age;
    }
}

class DogApp{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 10);

        System.out.println(dog1);
        System.out.println(dog1.golos());
        System.out.println(dog1.dogAge());
        dog1.dr();
        System.out.println(dog1.dogAge());
    }
}
