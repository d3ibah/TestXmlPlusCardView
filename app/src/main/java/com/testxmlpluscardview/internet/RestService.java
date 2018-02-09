package com.testxmlpluscardview.internet;

import android.util.Xml;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by Home911 on 09.02.2018.
 */

public class RestService {

    public static final String BASE_URL = "https://api.jeench.com/";
    private static RestService instanse;
    private RestApi restApi;

    public RestService() {
        init();
    }

    public static RestService getInstanse(){
        if(instanse == null){
            instanse = new RestService();
        }
        return instanse;
    }

    public RestApi getRestApi(){
        return restApi;
    }

    private void init(){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(20, TimeUnit.SECONDS)
                .connectTimeout(10, java.util.concurrent.TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .client(okHttpClient)
                .build();

        restApi = retrofit.create(RestApi.class);
    }
}