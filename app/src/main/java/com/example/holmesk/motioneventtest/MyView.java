package com.example.holmesk.motioneventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * 作者：holmes k
 * 时间：2017.04.21 20:19
 */


public class MyView extends Button {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(MainActivity.TAG, "MyView onTouchEvent.");
        Log.e(MainActivity.TAG, "MyView onTouchEvent default return "
                + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }

}
