package com.testxmlpluscardview.internet.get;

import com.google.gson.annotations.SerializedName;


/**
 * Created by Home911 on 09.02.2018.
 */

public class Message{

    @SerializedName("shop_logo")
    private String shopLogo;

    @SerializedName("shop_name")
    private String shopName;

    @SerializedName("item_name")
    private String itemName;

    @SerializedName("item_image")
    private String itemImage;

    @SerializedName("item_price")
    private float itemPrice;

    @SerializedName("shop_rank")
    private float shopRank;

    @SerializedName("point_distance")
    private int pointDistance;

    public String getShopLogo() {
        return shopLogo;
    }

    public String getShopName() {
        return shopName;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemImage() {
        return itemImage;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public float getShopRank() {
        return shopRank;
    }

    public int getPointDistance() {
        return pointDistance;
    }

}
