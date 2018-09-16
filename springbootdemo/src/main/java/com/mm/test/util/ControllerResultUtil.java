package com.mm.test.util;

import com.mm.test.enums.MessageEnum;
import com.mm.test.pojo.ControllerResult;

import javax.xml.crypto.Data;

public class ControllerResultUtil {
    public static ControllerResult successResult(Object data){
        ControllerResult controllerResult = new ControllerResult();
        controllerResult.setCode(MessageEnum.SUCESS_MESSAGE.getCode());
        controllerResult.setMessage(MessageEnum.SUCESS_MESSAGE.getMessage());
        controllerResult.setData(data);
        return controllerResult;
    }
    public static ControllerResult errorResult(Integer code,String message){
        ControllerResult controllerResult = new ControllerResult();
        controllerResult.setCode(code);
        controllerResult.setMessage(message);
        return controllerResult;
    }
}
