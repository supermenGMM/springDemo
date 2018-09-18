package com.mm.test;

public class BootException extends RuntimeException {
    private int code;

    public BootException(int code, String messge) {
        super(messge);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
