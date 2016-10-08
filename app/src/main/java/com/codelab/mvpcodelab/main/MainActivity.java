package com.codelab.mvpcodelab.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.codelab.mvpcodelab.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    MainContract.Presenter presenter;

    Button btnHipsterText;

    TextView tvHipsterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHipsterText = (Button) findViewById(R.id.btn_hipster);
        tvHipsterText = (TextView) findViewById(R.id.tv_text);

        presenter = new MainPresenter(this);

        btnHipsterText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onClickHipsterBtn();
            }
        });
    }

    @Override
    public void updateHipsterText(String hipsterText) {
        tvHipsterText.setText(hipsterText);
    }
}
