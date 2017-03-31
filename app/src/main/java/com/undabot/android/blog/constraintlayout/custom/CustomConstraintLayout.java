package com.undabot.android.blog.constraintlayout.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

import timber.log.Timber;

public class CustomConstraintLayout extends ConstraintLayout {
    private long startMillis;

    public CustomConstraintLayout(Context context) {
        super(context);
    }

    public CustomConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        startMillis = System.currentTimeMillis();
        Timber.d("<ConstrainLayout> %d", startMillis);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Timber.d("</ConstrainLayout> time to measure: %d ms", System.currentTimeMillis() - startMillis);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Timber.d("ConstraintLayout - time to draw: %d ms", System.currentTimeMillis() - startMillis);
    }
}
