package org.javaguru.student_anton_krivonogov.lesson_3.level_3;

class Chapter {
    private String title;
    private String text;

    public Chapter(String title, String text){
        this.title = title;
        this.text = text;
    }

    public String getTitle(){
        return title;
    }

    public String getText(){
        return text;
    }
}
