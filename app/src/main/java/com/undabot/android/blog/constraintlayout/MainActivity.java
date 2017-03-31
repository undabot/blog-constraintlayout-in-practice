package com.undabot.android.blog.constraintlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.plant(new Timber.DebugTree());

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_normal)
    public void onNormalLayoutPressed() {
        startActivity(NormalLayoutActivity.getIntent(this));
    }

    @OnClick(R.id.btn_constraint)
    public void onConstraintLayoutPressed() {
        startActivity(ConstraintLayoutActivity.getIntent(this));
    }
}
