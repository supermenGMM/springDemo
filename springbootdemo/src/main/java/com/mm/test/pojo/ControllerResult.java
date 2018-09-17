package com.mm.test.pojo;

import java.io.Serializable;

public class ControllerResult implements Serializable {
    private  Integer code;
    private String message;
    private Object data;

    @Override
    public String toString() {
        return "ControllerResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
