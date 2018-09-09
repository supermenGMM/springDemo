package com.mm.introduction;

import com.mm.aspectannotation.UsageTracked;

public interface Fit<T> {
    void say();

    String add();

    void read();


    void fix(Car car);

    void hello();
}
