package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;


    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
