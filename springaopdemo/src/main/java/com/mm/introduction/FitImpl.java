package com.mm.introduction;

public class FitImpl implements Fit {
    public void say() {
        System.out.println("fit"+this.hashCode());
    }
}
