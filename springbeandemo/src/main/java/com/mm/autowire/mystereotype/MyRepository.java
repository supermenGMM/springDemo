package com.mm.autowire.mystereotype;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface MyRepository {
    String value();

    Format format();
}
