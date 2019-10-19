package com.hacheon.todosample.common;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.hacheon.todosample.logic.local.AppDatabaseProvider;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initRoom();
        initSteho();
    }

    private void initSteho() {
        Stetho.initializeWithDefaults(this);
    }

    private void initRoom(){
        AppDatabaseProvider.getINSTACE(getApplicationContext());
        //TODO: itemprovider
    }


}
