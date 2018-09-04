package com.mm.service;

import com.mm.dao.PigDao;

import javax.sound.midi.Soundbank;

public class PigService {

    private PigDao pigDao;

    public PigService() {
    }

    public PigDao getPigDao() {
        return pigDao;
    }

    public void setPigDao(PigDao pigDao) {
        this.pigDao = pigDao;
    }

    public PigService(PigDao pigDao) {
        this.pigDao = pigDao;
    }

    public void say() {
        System.out.println("pigSerivce");
        pigDao.say();
    }
}
