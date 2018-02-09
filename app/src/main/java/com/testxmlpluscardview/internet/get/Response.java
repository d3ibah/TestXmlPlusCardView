package com.testxmlpluscardview.internet.get;

/**
 * Created by Home911 on 09.02.2018.
 */

public class Response
{
    private Message message;

    private String code;

    public Message getMessage ()
    {
        return message;
    }

    public void setMessage (Message message)
    {
        this.message = message;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", code = "+code+"]";
    }
}
