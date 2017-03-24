package com.example.lenovo_g50_70.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo-G50-70 on 2017/3/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
