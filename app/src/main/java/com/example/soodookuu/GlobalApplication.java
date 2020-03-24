package com.example.soodookuu;

import android.app.Application;
import android.content.Context;

/**
 * Way to access things like Context from anywhere in the app without
 * having to pass it around
 */

public class GlobalApplication extends Application
{
    private static Context appContext;

    @Override
    public void onCreate()
    {
        super.onCreate();
        appContext = getApplicationContext();

        /* If we have other classes that need context object to initialize when application is
        created, we can use the appContext here to process. */
    }

    public Context getAppContext()
    {
        return appContext;
    }
}
