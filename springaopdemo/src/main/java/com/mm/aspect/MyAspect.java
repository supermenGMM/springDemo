package com.mm.aspect;

import org.springframework.stereotype.Service;

@Service
public class MyAspect {
    public void before() {
        System.out.println("前置通知，某连接点之间执行的通知。但不能阻止连接点前的执行。出发异常");
    }

    public void after() {
        System.out.println("后置通知");
    }

    public void returnAdvice() {
        System.out.println("返回后通知，");
    }

    public void afterThrowingAdvice() {
        System.out.println("抛出异常后通知 ");
    }

    public void aroundAdvice() {
        System.out.println("环绕通知qian");
        System.out.println("环绕通知hou");
    }
}
