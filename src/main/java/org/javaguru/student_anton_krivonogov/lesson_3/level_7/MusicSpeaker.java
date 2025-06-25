package org.javaguru.student_anton_krivonogov.lesson_3.level_7;

public class MusicSpeaker {
    String model;
    int volum;
    boolean onOff;

    MusicSpeaker(String model, int volum, boolean onOff){
        this.model = model;
        this.volum = 0;
        this.onOff = false;
    }

    void musicOn(){
        this.onOff = true;
    }

    void volumUp(){
        if (this.onOff) {
            this.volum = this.volum + 1;
        }
    }

    void musicOff(){
        this.onOff = false;
        this.volum = 0;
    }

    String getModel(){
        return model;
    }
    int getVolum(){
        return volum;
    }
    boolean getOnOff(){
        return onOff;
    }
}
