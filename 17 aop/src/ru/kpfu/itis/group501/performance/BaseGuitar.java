package ru.kpfu.itis.group501.performance;

import org.springframework.stereotype.Component;

/**
 * Created by ma on 09.03.2017.
 */
@Component
public class BaseGuitar extends Guitar {
    @Override
    public void sound() {
        System.out.println("tum-tum-tum");
    }
}
