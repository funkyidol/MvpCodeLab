package com.codelab.mvpcodelab.model;

import com.codelab.mvpcodelab.model.pojo.HipsterModel;
import com.codelab.mvpcodelab.utils.RetrofitHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HipsterRepoImpl implements HipsterRepo {
    @Override
    public void getHipsterText(final GetHipsterTextCallback getHipsterTextCallback) {
        Retrofit retrofit = RetrofitHelper.getInstance(null).getRetrofit();

        Call<HipsterModel> hipsterTextCall =
                retrofit.create(HipsterApiService.class).getHipsterText();
        hipsterTextCall.enqueue(new Callback<HipsterModel>() {
            @Override
            public void onResponse(Call<HipsterModel> call, Response<HipsterModel> response) {
                if (response.body() != null) getHipsterTextCallback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<HipsterModel> call, Throwable t) {
                getHipsterTextCallback.onFailure(t);
            }
        });
    }
}
