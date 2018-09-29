package com.mm.test.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut(value = "execution(public * com.mm.test.service..*.*(..))")
    public void pointcut() {

    }

    @Before(value = "pointcut()")
    public void before() {
        ServletRequestAttributes requestAttributes
                = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        logger.info("url={}", request.getRequestURI());
        logger.info("method={}", request.getMethod());
        logger.info("remoteport={},localport={}", request.getRemotePort(), request.getLocalPort());

//        logger.info("staticPart={}", joinpoint.getStaticPart());
//        logger.info(joinpoint.toString()+",,"+joinpoint.getStaticPart().getAnnotations());
//        joinpoint.proceed();

    }

    @AfterReturning(returning = "object", pointcut = "pointcut()")
    public void afterReturning(Object object) {
        logger.info("返回值={}", object);
    }

    @After(value = "pointcut())")
    public void after() {
        logger.info("请求结束");
    }

    @AfterThrowing(value = "pointcut()" ,throwing = "e")
    public void afterThrowin(Exception e) {
        logger.info("异常",e);
    }
}

