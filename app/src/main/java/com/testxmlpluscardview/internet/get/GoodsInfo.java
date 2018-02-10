package com.testxmlpluscardview.internet.get;

/**
 * Created by Home911 on 09.02.2018.
 */

public class GoodsInfo
{
    private Response response;

    public Response getResponse ()
    {
        return response;
    }

    public void setResponse (Response response)
    {
        this.response = response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [response = "+response+"]";
    }
}
