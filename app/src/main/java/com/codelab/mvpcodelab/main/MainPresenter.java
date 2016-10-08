package com.codelab.mvpcodelab.main;

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void onClickHipsterBtn() {

    }
}
