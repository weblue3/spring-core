package me.whiteship.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by 김홍준
 * Date: 2021-01-06
 * Time: 오후 5:59
 */
@Component
@Aspect
public class PerfAspect {

    //--@Around("execution(* me.whiteship..*.EventService.*(..))")
    @Around("@annotation(PerfLogging)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }
}
