package com.undabot.android.blog.constraintlayout.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import timber.log.Timber;

public class CustomLinearLayout extends LinearLayout {
    private long startMillis;

    public CustomLinearLayout(Context context) {
        super(context);
    }

    public CustomLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        startMillis = System.currentTimeMillis();
        Timber.d("<LinearLayout> %d", startMillis);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Timber.d("</LinearLayout> time to measure: %d ms", System.currentTimeMillis() - startMillis);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Timber.d("LinearLayout - time to draw: %d ms", System.currentTimeMillis() - startMillis);
    }
}
