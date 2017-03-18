package ru.kpfu.itis.group501.performance.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import ru.kpfu.itis.group501.performance.TechnicalAssistant;

/**
 * Created by ma on 15.03.2017.
 */
public class TechnicalAssistantAnotherAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        if (methodInvocation.getMethod().getName().equals("perform")) {
            TechnicalAssistant ta = new TechnicalAssistant();
            while (!ta.smartCheckMic()) {
                System.out.println("Bad. Try new mic now!");
            }
            System.out.println("Yeah, finally it is working!");
            System.out.println("who is performing: " + methodInvocation.getThis().toString());
        }
        return methodInvocation.proceed();
    }
}
