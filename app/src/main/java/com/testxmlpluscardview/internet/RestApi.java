package com.testxmlpluscardview.internet;


import com.testxmlpluscardview.internet.get.Response;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Home911 on 09.02.2018.
 */

public interface RestApi {

    @GET("search-items")
    Observable<Response> getResponse();

}
