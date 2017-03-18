package ru.kpfu.itis.group501.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by ma on 09.03.2017.
 */
@Component
public class Performance {
    //@Resource(name="guitarist")
    @Resource
    @Qualifier("vasya")
    private Performer mainPerformer;
    public void setSinger(Performer mainPerformer) {
        this.mainPerformer = mainPerformer;
    }

    public void makePerformance() {
        System.out.println("Our main artist is: " + mainPerformer);
        mainPerformer.perform();
    }
}
