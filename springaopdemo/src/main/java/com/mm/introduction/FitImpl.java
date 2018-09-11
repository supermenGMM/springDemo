package com.mm.introduction;

import com.mm.aspectannotation.UsageTracked;
import org.springframework.stereotype.Service;

@Service()
public class FitImpl implements Fit<String> {
    public void say() {
        System.out.println("fit"+this.hashCode());
    }

    @Override
    public String add() {
        return "我是假的add方法";
    }

    @Override
    public void fix(Car car) {
        car.setColor("balck");
        System.out.println(car);
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void read() throws RuntimeException {
        throw new RuntimeException();
    }




}
