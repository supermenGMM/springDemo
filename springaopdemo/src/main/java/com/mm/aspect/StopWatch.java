package com.mm.aspect;

import org.springframework.stereotype.Service;

/**
 * 环绕通知的一个工具
 */
@Service
public class StopWatch {


    public void start(String methodName, Object[] args) {
        System.out.println("被环绕的方法为:"+methodName);
        for (Object obj    :args
             ) {
            System.out.print(obj+",");
        }
        System.out.println("dosomething");
    }
    public void stop(){
        System.out.println("环绕后执行的结尾动作");
    }

    public Object exceptionDeal() {
        System.out.println("处理异常的事情");
        return null;
    }
}

