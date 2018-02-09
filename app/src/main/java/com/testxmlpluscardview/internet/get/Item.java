package com.testxmlpluscardview.internet.get;

import org.simpleframework.xml.Element;

/**
 * Created by Home911 on 09.02.2018.
 */

public class Item
{
    @Element(name = "point_distance")
    private int pointDistance;

    @Element(name = "group_type")
    private String groupType;

    @Element(name = "currency_id")
    private String currencyId;

    @Element(name = "item_shares")
    private String itemShares;

    @Element(name = "item_likes")
    private String itemLikes;

    @Element(name = "item_price")
    private float itemPrice;

    @Element(name = "shop_id")
    private String shopId;

    @Element(name = "item_bonus_amount")
    private String itemBonusAmount;

    @Element(name = "shop_logo")
    private String shopLogo;

    @Element(name = "item_bonus_price")
    private String itemBonusPrice;

    @Element(name = "shop_name")
    private String shopName;

    @Element(name = "point_address")
    private String pointAddress;

    @Element(name = "item_image")
    private String itemImage;

    @Element(name = "shop_rank")
    private float shopRank;

    @Element(name = "point_coords")
    private String pointCoords;

    @Element(name = "item_is_liked")
    private String itemIsLiked;

    @Element(name = "item_name")
    private String itemName;

    @Element(name = "point_time_id")
    private String pointTimeId;

    @Element(name = "point_rank")
    private String pointRank;

    @Element(name = "item_id")
    private String itemId;

    @Element(name = "item_comments")
    private String itemComments;

    @Element(name = "point_id")
    private String pointId;



    @Element(name = "pointDistance")
    public int getPointDistance()
    {
        return pointDistance;
    }

    public void setPointDistance(int pointDistance)
    {
        this.pointDistance = pointDistance;
    }

    public String getGroupType()
    {
        return groupType;
    }

    public void setGroupType(String groupType)
    {
        this.groupType = groupType;
    }

    public String getCurrencyId()
    {
        return currencyId;
    }

    public void setCurrencyId(String currencyId)
    {
        this.currencyId = currencyId;
    }

    public String getItemShares()
    {
        return itemShares;
    }

    public void setItemShares(String itemShares)
    {
        this.itemShares = itemShares;
    }

    public String getItemLikes()
    {
        return itemLikes;
    }

    public void setItemLikes(String itemLikes)
    {
        this.itemLikes = itemLikes;
    }

    public float getItemPrice()
    {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice)
    {
        this.itemPrice = itemPrice;
    }

    public String getShopId()
    {
        return shopId;
    }

    public void setShopId(String shopId)
    {
        this.shopId = shopId;
    }

    public String getItemBonusAmount()
    {
        return itemBonusAmount;
    }

    public void setItemBonusAmount(String itemBonusAmount)
    {
        this.itemBonusAmount = itemBonusAmount;
    }

    public String getShopLogo()
    {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo)
    {
        this.shopLogo = shopLogo;
    }

    public String getItemBonusPrice()
    {
        return itemBonusPrice;
    }

    public void setItemBonusPrice(String itemBonusPrice)
    {
        this.itemBonusPrice = itemBonusPrice;
    }

    public String getShopName()
    {
        return shopName;
    }

    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    public String getPointAddress()
    {
        return pointAddress;
    }

    public void setPointAddress(String pointAddress)
    {
        this.pointAddress = pointAddress;
    }

    public String getItemImage()
    {
        return itemImage;
    }

    public void setItemImage(String itemImage)
    {
        this.itemImage = itemImage;
    }

    public float getShopRank()
    {
        return shopRank;
    }

    public void setShopRank(float shopRank)
    {
        this.shopRank = shopRank;
    }

    public String getPointCoords()
    {
        return pointCoords;
    }

    public void setPointCoords(String pointCoords)
    {
        this.pointCoords = pointCoords;
    }

    public String getItemIsLiked()
    {
        return itemIsLiked;
    }

    public void setItemIsLiked(String itemIsLiked)
    {
        this.itemIsLiked = itemIsLiked;
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public String getPointTimeId()
    {
        return pointTimeId;
    }

    public void setPointTimeId(String pointTimeId)
    {
        this.pointTimeId = pointTimeId;
    }

    public String getPointRank()
    {
        return pointRank;
    }

    public void setPointRank(String pointRank)
    {
        this.pointRank = pointRank;
    }

    public String getItemId()
    {
        return itemId;
    }

    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }

    public String getItemComments()
    {
        return itemComments;
    }

    public void setItemComments(String itemComments)
    {
        this.itemComments = itemComments;
    }

    public String getPointId()
    {
        return pointId;
    }

    public void setPointId(String pointId)
    {
        this.pointId = pointId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pointDistance = "+ pointDistance +", groupType = "+ groupType +", currencyId = "+ currencyId +", itemShares = "+ itemShares +", itemLikes = "+ itemLikes +", itemPrice = "+ itemPrice +", shopId = "+ shopId +", itemBonusAmount = "+ itemBonusAmount +", shopLogo = "+ shopLogo +", itemBonusPrice = "+ itemBonusPrice +", shopName = "+ shopName +", pointAddress = "+ pointAddress +", itemImage = "+ itemImage +", shopRank = "+ shopRank +", pointCoords = "+ pointCoords +", itemIsLiked = "+ itemIsLiked +", itemName = "+ itemName +", pointTimeId = "+ pointTimeId +", pointRank = "+ pointRank +", itemId = "+ itemId +", itemComments = "+ itemComments +", pointId = "+ pointId +"]";
    }
}
