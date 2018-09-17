package com.mm.test.service;

import com.mm.test.BootException;
import com.mm.test.dao.FoodResposity;
import com.mm.test.enums.MessageEnum;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin2.message.Message;

@Service
public class FoodSerice {
    @Autowired
    private FoodResposity foodResposity;

    public void gettGradeByAge(int age) throws BootException {
        if (age < 16) {
            throw new BootException(MessageEnum.CONDITION_ERROR.getCode(), MessageEnum.CONDITION_ERROR.getMessage());
        }
        //做点什么呢。
    }
}
