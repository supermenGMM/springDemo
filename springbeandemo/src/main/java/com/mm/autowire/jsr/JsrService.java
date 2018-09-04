package com.mm.autowire.jsr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Service
public class JsrService {
//    @Resource(name = "jsrDao")
    private JsrDao jsrDao;

//    @Resource(name = "jsrDao")
    @Inject
    public void setJsrDao(@Named("aaa") JsrDao jsrDao) {
        this.jsrDao = jsrDao;
    }

    @PostConstruct
    public void init() {
        System.out.println("init---jsr");
    }

    @PreDestroy
    public void destory() {
        System.out.println("dest ---jsr");
    }

    public void save() {
        jsrDao.save();
    }
}
