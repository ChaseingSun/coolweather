package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 省
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class Province extends DataSupport{
    private int id;
    //省的名称
    private String provinceName;
    //省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
