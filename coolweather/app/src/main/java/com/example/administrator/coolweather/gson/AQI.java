package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class AQI {
    @SerializedName("city")
    public AQTCity city;

    public class AQTCity{
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
