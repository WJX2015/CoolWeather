package com.example.lenovo_g50_70.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo-G50-70 on 2017/3/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
