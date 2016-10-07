package com.codelab.mvpcodelab.utils;

import android.content.Context;
import android.support.annotation.Nullable;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kshitij on 10/3/16.
 */
public class RetrofitHelper {
    private static Retrofit retrofit;
    private static RetrofitHelper instance;

    private RetrofitHelper() {
    }

    public static RetrofitHelper getInstance(@Nullable final Context appContext) {
        if (instance == null && appContext != null) {
            synchronized (RetrofitHelper.class) {
                instance = new RetrofitHelper();

                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient client = new OkHttpClient.Builder()/*.addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        ConnectivityManager cm =
                                (ConnectivityManager) appContext.getSystemService(Context
                                        .CONNECTIVITY_SERVICE);
                        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
                        boolean isConnected =
                                activeNetwork != null && activeNetwork.isConnectedOrConnecting();

                        if (isConnected) {
                            return chain.proceed(chain.request());
                        } else {
                            throw new IOException("No Internet Connection. Please try again.");
                        }
                    }
                })*/.addInterceptor(interceptor).build();

                retrofit = new Retrofit.Builder().baseUrl(Constants.ApiConsts.BASE_URL)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

            }
        }
        return instance;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

}
