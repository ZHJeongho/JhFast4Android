package com.jeongho.fast4android;

import android.app.Application;
import android.content.Context;

/**
 * Created by Jeongho on 2016/12/23.
 */

public class MyApplication extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }

    public static Context getContext() {
        return sContext;
    }
}
