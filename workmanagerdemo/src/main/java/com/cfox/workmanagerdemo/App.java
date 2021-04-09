package com.cfox.workmanagerdemo;

import android.app.Application;
import android.util.Log;

import androidx.work.Configuration;
import androidx.work.WorkManager;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Configuration.Builder builder = new Configuration.Builder();
        builder.setMinimumLoggingLevel(Log.VERBOSE);
        WorkManager.initialize(this.getApplicationContext(), builder.build());
    }
}
