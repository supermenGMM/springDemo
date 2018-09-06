package com.mm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyAspect {
    public void before() {
        System.out.println("前置通知，某连接点之间执行的通知。但不能阻止连接点前的执行。出发异常");
    }

    public void after() {
        System.out.println("后置通知，抛出异常之后还是会通知.在返回后通知之后");
    }

    public void returnAdvice() {
        System.out.println("返回后通知，抛出异常就没有了，如果是环绕通知,那么不是看方法是否抛出异常，而是看环绕通知的" +
                "那个方法是否抛出了异常");
    }

    public void afterThrowingAdvice() {
        System.out.println("抛出异常后通知,如果是环绕通知。 ");
    }

    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws RuntimeException {
        System.out.println("环绕通知qian");
        try {
            System.out.println(proceedingJoinPoint.toShortString()+"=-==========="+proceedingJoinPoint.toLongString());

            Object proceed = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知hou");
            throw  new RuntimeException();

        }
    }

    /**
     * 环绕通知
     */
    @Autowired
    private  StopWatch stopWatch;
    public Object aroundAdviceHasParam(ProceedingJoinPoint proceedingJoinPointm,String name,int age) {
        stopWatch.start(proceedingJoinPointm.toLongString(),proceedingJoinPointm.getArgs());
        try {
            return proceedingJoinPointm.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return stopWatch.exceptionDeal();
        }finally {
            stopWatch.stop();
        }
    }
}
