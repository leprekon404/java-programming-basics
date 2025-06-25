package org.javaguru.student_anton_krivonogov.lesson_3.level_3;


class Book {
    private String name;
    private String author;
    private int year;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String name, String author, int year, Chapter chapter1, Chapter chapter2){
        this.name = name;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public Chapter getChapter1(){
        return chapter1;
    }
    public Chapter getChapter2(){
        return chapter2;
    }
}
