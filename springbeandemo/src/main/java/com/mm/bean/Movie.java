package com.mm.bean;

import java.util.Date;

public class Movie {
    //必要参数
    private int no;
    private String name;
    private Date time;
    //可选参数
    private String type;
    private String desc;

    protected Movie(MovieBuilder movieBuilder) {
        this.no = movieBuilder.getNo();
        this.name = movieBuilder.getName();
        this.time = movieBuilder.getTime();
        this.type = movieBuilder.getType();
        this.desc = movieBuilder.getDesc();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
