package com.mm.autowire.genericity;

public class IntegerStore implements  Store<Integer> {
    @Override
    public void say() {
        System.out.println("integer store");
    }
}

