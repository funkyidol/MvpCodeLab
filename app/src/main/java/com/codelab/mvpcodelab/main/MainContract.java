package com.codelab.mvpcodelab.main;

public interface MainContract {

    interface View{
        void updateHipsterText(String hipsterText);

        void showToast(String msg);
    }

    interface Presenter{
        void onClickHipsterBtn();
    }
}
