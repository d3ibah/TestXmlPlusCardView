package com.testxmlpluscardview.internet;

import com.testxmlpluscardview.internet.get.GoodsInfo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Home911 on 09.02.2018.
 */

public interface RestApi {

    @GET("search-items")
    Observable<List<GoodsInfo>> getGoodsItems();

}
