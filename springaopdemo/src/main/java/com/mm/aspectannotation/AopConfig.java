package com.mm.aspectannotation;

import com.mm.introduction.Car;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopConfig {
    @DeclareParents(value = "com.mm.introduction.Fit+",defaultImpl = UsageTrackedImpl.class)
    public static UsageTracked mixin;


    @Before(value = "execution(* com.mm.introduction.*+.*(..))&&this(usageTracked)")
    public void beforeIntroduce(UsageTracked usageTracked) {
        usageTracked.incrementTrackedCount();;
    }


    /**
     * 定义切入点。
     * 返回值必须是void
     */
    @Pointcut(value = "execution(* com.mm..Fit+.*(..))")
    private void anyOldTransfer(){}


    /**
     * 定义通知
     * advice
     */
//    @Before(value = "anyOldTransfer()") //这里引用了上面的切面
    public void before() {
        System.out.println("前置通知");
    }

    /**
     * 接受传入参数
     * advice
     */
//    @Before(value = "anyOldTransfer()&&args(car)") //这里引用了上面的切面
//    @Before(value = "anyOldTransfer()&&args(car)")
    public void beforeWithParm(Car car) {
        System.out.println(car);
    }

    @AfterReturning(value = "execution(* com.mm..*.*(..))",returning = "retVal")
    public void returning(String retVal) {
        System.out.println("返回值:"+retVal);
    }

    @AfterThrowing(value = "anyOldTransfer()",throwing = "exception")
    public void afterThrowing(Exception exception) {
        System.out.println("抛出异常后通知");
        if (exception instanceof RuntimeException) {
            System.out.println("有bug。自己好好看看！！！！");
        }
    }

    @After(value = "anyOldTransfer()")
    public void after() {
        System.out.println("处理日志和异常");
    }

    @Around(value = "anyOldTransfer()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知前");
        proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        System.out.println("环绕通知");
    }


}
