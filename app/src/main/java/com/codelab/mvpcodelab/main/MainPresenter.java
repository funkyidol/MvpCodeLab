package com.codelab.mvpcodelab.main;

import com.codelab.mvpcodelab.model.HipsterRepo;
import com.codelab.mvpcodelab.model.HipsterRepoImpl;
import com.codelab.mvpcodelab.model.pojo.HipsterModel;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;

    HipsterRepo hipsterRepo = new HipsterRepoImpl();

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void onClickHipsterBtn() {
        hipsterRepo.getHipsterText(new HipsterRepo.GetHipsterTextCallback() {
            @Override
            public void onSuccess(HipsterModel hipsterModel) {
                view.updateHipsterText(hipsterModel.getText());
            }

            @Override
            public void onFailure(Throwable throwable) {
                // TODO: 10/8/2016 Show toast
            }
        });
    }
}
