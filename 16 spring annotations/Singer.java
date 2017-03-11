package ru.kpfu.itis.group501.performance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ma on 09.03.2017.
 */
@Component
public class Singer implements Performer {
    private String name;
    @Value("Semaphore")
    public void setName(String name) {
        this.name = name;
    }
    public void perform() {
        System.out.println("Beautiful song!");
    }
}
