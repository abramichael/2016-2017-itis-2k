package ru.kpfu.itis.group501.performance.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import ru.kpfu.itis.group501.performance.TechnicalAssistant;

/**
 * Created by ma on 15.03.2017.
 */
@Aspect
public class TechnicalAssistantAspect {
    /*
    @Before("execution(* *..*.perform())")
    public void makeGoodPerformace(JoinPoint jp) {
        (new TechnicalAssistant()).checkMic();
    }
    */
    @Around("execution(* *..*.perform())")
    public Object makeBestPerformance(ProceedingJoinPoint pjp) throws Throwable {
        TechnicalAssistant ta = new TechnicalAssistant();
        while (!ta.smartCheckMic()) {
            System.out.println("Bad. Try new mic now!");
        }
        System.out.println("Yeah, finally it is working!");
        return pjp.proceed();
    }

}
