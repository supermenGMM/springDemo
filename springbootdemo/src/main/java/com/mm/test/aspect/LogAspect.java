package com.mm.test.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut(value = "execution(public com.mm.test..*.*(..))")
    public void pointcut() {
    }

    @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint) {
//        logger.info(joinpoint.toString()+",,"+joinpoint.);
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        logger.info("url={}", request.getRequestURI());
        logger.info("port={}", request.getServerPort() + "," + request.getRemotePort());
        logger.info("ip={}", request.getRemoteAddr());
        logger.info("method={}", request.getMethod());

        logger.info("cleass-method={}", joinPoint.toLongString());
        logger.info("cleass_method_args", joinPoint.getArgs());

    }

    @After(value = "pointcut()")
    public void after() {
        logger.info("结束了");
    }

    @AfterReturning(value = "pointcut()",returning = "object")
    public void doAfterReturning(Object object) {
        logger.info("response={}",object.toString());
    }
}
