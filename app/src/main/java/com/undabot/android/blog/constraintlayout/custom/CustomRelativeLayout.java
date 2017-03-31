package com.undabot.android.blog.constraintlayout.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import timber.log.Timber;


public class CustomRelativeLayout extends RelativeLayout {
    public CustomRelativeLayout(Context context) {
        super(context);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Timber.d("<RelativeLayout>");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Timber.d("</RelativeLayout>");
    }
}
