package ru.kpfu.itis.group501.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by ma on 09.03.2017.
 */
@Component
@Qualifier("vasya")
public class Guitarist implements Performer {

    private Guitar guitar;
    @Autowired
    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }
    @Override
    public void perform() {
        System.out.printf("I play my wonderful guitar:");
        guitar.sound();
    }
}
