package com.codelab.mvpcodelab;

import android.app.Application;

import com.codelab.mvpcodelab.utils.RetrofitHelper;

import timber.log.Timber;

/**
 * Created by calance-dc on 10/7/2016.
 */

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
