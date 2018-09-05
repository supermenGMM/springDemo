package com.mm.serivce;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Primary
@Order(1)
public class MovieService {
    public void save() {
        System.out.println("save---");
    }

    public void save2() {
        System.out.println("save exception");
        throw new RuntimeException("抛出异常");
    }
}
