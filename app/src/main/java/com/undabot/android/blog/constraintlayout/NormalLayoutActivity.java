package com.undabot.android.blog.constraintlayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NormalLayoutActivity extends AppCompatActivity {

    public static Intent getIntent(Context context) {
        return new Intent(context, NormalLayoutActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_layout);
    }
}
