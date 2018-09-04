package com.mm.bean;

import java.util.Date;

public class MovieBuilder {
    //必要参数
    private final int no;
    private final String name;
    private final Date time;
    //可选参数
    private String type;
    private String desc;
    public MovieBuilder(int no, String name, Date time) {
        this.no = no;
        this.name = name;
        this.time = time;
    }

    public MovieBuilder type(String type){
        this.type=type;
        return  this;
    }

    public MovieBuilder desc(String desc) {
        this.desc =desc;
        return this;
    }

    public Movie build(){
        return  new Movie(this);
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Date getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
