package com.mm.test.enums;


public enum MessageEnum {

    SUCESS_MESSAGE(0, "成功"),
    ERROR_MESSAGE(1,"失败"),
    FIELD_ERROR(2,"字段格式错误"),
    CONDITION_ERROR(4,"条件不满足"),
    UNKONW_ERROR(5,"未知错误"),
    REQUEST_ERROR(6,"请求方式错误，请按照说明要求");


    private MessageEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;

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
}