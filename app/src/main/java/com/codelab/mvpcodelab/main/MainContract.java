package com.codelab.mvpcodelab.main;

public interface MainContract {

    interface View{
        void updateHipsterText(String hipsterText);
    }

    interface Presenter{
        void onClickHipsterBtn();
    }
}
