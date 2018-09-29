package com.mm.demo.domain;

public class City {
    private Long id;
    private Long proviinceId;
    private String cityName;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProviinceId() {
        return proviinceId;
    }

    public void setProviinceId(Long proviinceId) {
        this.proviinceId = proviinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City() {

    }


}
