package com.mm.test;

public class BootException extends RuntimeException {
    private int code;
    private String messge;

    public BootException(int code, String messge) {
        this.code = code;
        this.messge = messge;
    }
}
