package com.undabot.android.blog.constraintlayout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ConstraintLayoutActivity extends AppCompatActivity {

    public static Intent getIntent(Context context) {
        return new Intent(context, ConstraintLayoutActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
    }
}
