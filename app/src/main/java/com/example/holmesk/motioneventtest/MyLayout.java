package com.example.holmesk.motioneventtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * 作者：holmes k
 * 时间：2017.04.21 20:14
 */


public class MyLayout extends FrameLayout {


    public MyLayout(@NonNull Context context) {
        super(context);
    }

    public MyLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(MainActivity.TAG, "MyLayout onInterceptTouchEvent.");
        Log.e(MainActivity.TAG, "MyLayout onInterceptTouchEvent default return "
                + super.onInterceptTouchEvent(ev));
        return super.onInterceptTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(MainActivity.TAG, "MyLayout onTouchEvent.");
        Log.e(MainActivity.TAG, "MyLayout onTouchEvent default return "
                + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
