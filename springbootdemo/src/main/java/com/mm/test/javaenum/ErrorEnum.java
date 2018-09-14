package com.mm.test.javaenum;

import javax.swing.plaf.metal.OceanTheme;

public enum ErrorEnum {
    SUCESS_RETURN("0","成功"),
    ERROR_RETURN("1","失败");

    ErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
