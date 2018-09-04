package com.mm.autowire.jsr;

import org.springframework.stereotype.Repository;

import javax.sound.midi.Soundbank;

@Repository(value = "aaa")
public class JsrDao {
    public void save() {
        System.out.println("save jsr");
    }
}
