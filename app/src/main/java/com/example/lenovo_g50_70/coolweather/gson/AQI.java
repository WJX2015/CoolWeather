package com.example.lenovo_g50_70.coolweather.gson;

/**
 * Created by lenovo-G50-70 on 2017/3/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
