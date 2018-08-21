package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 县
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class Country extends DataSupport {
    private int id;
    //县的名称
    private String countryName;
    //天气id
    private int weatherId;
    //当前县所属市id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}