package com.mm.autowire.genericity;

public class StringStore implements Store<String> {

    @Override
    public void say() {
        System.out.println("string");
    }

    private void init() {
        System.out.println("init");
    }

    private void destory() {
        System.out.println("desctory");
    }
}
