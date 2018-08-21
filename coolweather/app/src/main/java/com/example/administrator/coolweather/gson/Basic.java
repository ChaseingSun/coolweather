package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
