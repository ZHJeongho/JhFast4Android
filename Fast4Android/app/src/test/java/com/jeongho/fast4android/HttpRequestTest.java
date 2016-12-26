package com.jeongho.fast4android;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import volley.JeonghoClient;

/**
 * Created by Jeongho on 2016/12/26.
 */

public class HttpRequestTest {
    private JeonghoClient mClient;

    @Before
    public void setUp(){
        mClient = new JeonghoClient();
    }

    @Test
    public void test(){
        int result = mClient.add(1, 2);
        Assert.assertEquals(3, result);
    }
}
