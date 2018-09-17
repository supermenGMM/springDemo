package com.mm.test.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut(value = "execution(public com.mm.test...*(..))")
    public void pointcut() {
    }

    @Before(value = "pointcut()")
    public void before(Joinpoint joinpoint) throws Throwable {
//        logger.info(joinpoint.toString()+",,"+joinpoint.getStaticPart().getAnnotations());
//        joinpoint.proceed();

    }
}
