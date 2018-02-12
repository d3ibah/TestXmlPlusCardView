package com.testxmlpluscardview.internet.get;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Home911 on 09.02.2018.
 */

public class Response
{
    @SerializedName("message")
    private List<Message> responseMessagesList;

    private String code;

    public List<Message> getResponseMessagesList() {
        return responseMessagesList;
    }

    public void setResponseMessagesList(List<Message> responseMessagesList) {
        this.responseMessagesList = responseMessagesList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
