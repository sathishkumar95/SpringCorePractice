package com.glider.model;

public class City {
    String name;
    String cityId;

    public String getName() {
        return name;
    }

    public String getCityId() {
        return cityId;
    }

    public City(String name, String cityId) {
        this.name = name;
        this.cityId = cityId;
    }
}
