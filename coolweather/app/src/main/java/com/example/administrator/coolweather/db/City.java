package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/** 市
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class City extends DataSupport {
    private int id;
    //市的名称
    private String cityName;
    //市的代号
    private int cityCode;
    //当前市所属省的id值
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
