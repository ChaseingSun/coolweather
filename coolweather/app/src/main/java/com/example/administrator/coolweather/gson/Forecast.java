package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class Forecast {

    @SerializedName("date")
    public String date;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{
        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;
    }
}
