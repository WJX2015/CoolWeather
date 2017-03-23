package com.example.lenovo_g50_70.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lenovo-G50-70 on 2017/3/23.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client =new OkHttpClient();
        Request request =new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
