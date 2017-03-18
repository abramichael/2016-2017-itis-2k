package ru.kpfu.itis.group501.performance;

import org.springframework.aop.framework.ProxyFactory;
import ru.kpfu.itis.group501.performance.aspects.TechnicalAssistantAnotherAspect;

/**
 * Created by ma on 09.03.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        Performer p = new Singer("D.Malikov");
        ProxyFactory pf = new ProxyFactory(p);
        pf.addAdvice(new TechnicalAssistantAnotherAspect());
        Performer p1 = (Performer) pf.getProxy();
        p1.perform();
    }
}
