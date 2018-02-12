package com.testxmlpluscardview.internet;



import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Home911 on 09.02.2018.
 */

public class RestService {

    public static final String BASE_URL = "https://api.jeench.com/v1/";
    private static RestService instanse;
    private RestApi restApi;

    public RestService() {
        init();
    }

    public static RestService getInstanse(){
        Log.e("2", "getInstanse RestServise");
        if(instanse == null){
            instanse = new RestService();
        }
        return instanse;
    }

    public RestApi getRestApi(){
        Log.e("3", "getRestApi RestServise");
        return restApi;
    }

    private void init(){
        Log.e("4", "init RestServise 1");
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        Log.e("4", "init RestServise 2");

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(20, TimeUnit.SECONDS)
                .connectTimeout(10, java.util.concurrent.TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();

        Log.e("4", "init RestServise 3");

        Gson gson = new GsonBuilder().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();

        Log.e("4", "init RestServise 4");

        restApi = retrofit.create(RestApi.class);

        Log.e("4", "init RestServise 5");
    }
}