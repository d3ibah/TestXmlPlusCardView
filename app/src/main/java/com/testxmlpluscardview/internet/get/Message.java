package com.testxmlpluscardview.internet.get;

/**
 * Created by Home911 on 09.02.2018.
 */

public class Message
{
    private Item item;

    public Item getItem ()
    {
        return item;
    }

    public void setItem (Item item)
    {
        this.item = item;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [item = "+item+"]";
    }
}
