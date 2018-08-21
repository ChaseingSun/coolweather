package com.example.administrator.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 *  okhttp
 * @author Likang
 * @version 1.0
 * @date 2018/8/21 0021
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
