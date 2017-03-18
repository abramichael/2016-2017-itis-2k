package ru.kpfu.itis.group501.performance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by ma on 09.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-config.xml");

        Performer s = (Performer) ac.getBean("singer");
        s.perform();
    }
}
