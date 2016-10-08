package com.codelab.mvpcodelab.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codelab.mvpcodelab.R;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
    }

    @Override
    public void updateHipsterText(String hipsterText) {

    }
}
