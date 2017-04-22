package com.example.holmesk.motioneventtest;

import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private TextView tv;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.myImg);
        tv = (TextView) findViewById(R.id.myTv);
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = MotionEventCompat.getActionMasked(event);
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        tv.setText("手指按下");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        tv.setText("移动");
                        break;
                    case MotionEvent.ACTION_UP:
                        tv.setText("手指抬起");
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        tv.setText("aaa");
                        break;
                    case MotionEvent.ACTION_OUTSIDE:
                        tv.setText("越界了");
                        break;
                    case MotionEvent.ACTION_POINTER_DOWN:
                        tv.setText("两指触控");
                        break;
                    case MotionEvent.ACTION_POINTER_UP:
                        tv.setText("取消两指");
                        break;
                }

                return true;
            }
        });

    }
}
