package ru.kpfu.itis.group501.game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import ru.kpfu.itis.group501.game.Game;

/**
 * Created by ma on 02.03.2017.
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-config.xml");
        Game g = (Game) ac.getBean("game");
        g.start();
    }
}
