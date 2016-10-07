package com.codelab.mvpcodelab;

import android.app.Application;

import com.codelab.mvpcodelab.utils.RetrofitHelper;

import timber.log.Timber;

public class MvpApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        initRetrofit();

    }

    private void initRetrofit() {
        RetrofitHelper.getInstance(getApplicationContext());
    }

}
