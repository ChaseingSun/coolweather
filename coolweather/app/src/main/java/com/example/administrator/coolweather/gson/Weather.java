package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class Weather {

    @SerializedName("status")
    public String status;

    @SerializedName("now")
    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @SerializedName("basic")
    public Basic basic;

    @SerializedName("aqi")
    public AQI aqi;

    @SerializedName("suggestion")
    public Suggestion suggestion;
}
