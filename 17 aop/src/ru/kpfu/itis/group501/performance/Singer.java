package ru.kpfu.itis.group501.performance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ma on 09.03.2017.
 */
@Component
public class Singer implements Performer {
    private String name;

    public Singer() {}
    public Singer(String s) {
        setName(s);
    }

    @Value("Semaphore")
    public void setName(String name) {
        this.name = name;
    }


    public void perform() {
        (new TechnicalAssistant()).checkMic();
        System.out.println("Beautiful song!");
    }


    public String toString() {
        return "PEVETS " + name;
    }
}
