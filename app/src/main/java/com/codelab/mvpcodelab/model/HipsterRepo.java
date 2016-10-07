package com.codelab.mvpcodelab.model;

import com.codelab.mvpcodelab.model.pojo.HipsterModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface HipsterRepo {

    void getHipsterText(GetHipsterTextCallback getHipsterTextCallback);

    interface GetHipsterTextCallback {
        void onSuccess(HipsterModel hipsterModel);

        void onFailure(Throwable throwable);
    }

    interface HipsterApiService {
        @Headers("Content-Type: application/json")
        @GET("api/?html=false")
        Call<HipsterModel> getHipsterText();
    }
}
