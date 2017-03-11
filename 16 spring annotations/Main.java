package ru.kpfu.itis.group501.performance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ma on 09.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        /*
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(MyConfiguration.class);
        */
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-config.xml");

        // Singer s = ac.getBean(Singer.class);
        // s.perform();

        Performance p = ac.getBean(Performance.class);
        p.makePerformance();
        Guitarist g = ac.getBean(Guitarist.class);
        g.perform();
    }
}
