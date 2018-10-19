package com.linger.flowercolor;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.widget.RelativeLayout;

import static android.R.attr.propertyName;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout view;//花的颜色；
    @Override
   
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view= (RelativeLayout) findViewById(R.id.activity_main);
        //属性动画
        ObjectAnimator parentAnimator=ObjectAnimator.ofInt(
				view,"backgroundColor",
                Color.parseColor("#ff0000"),
				Color.parseColor("#0000ff"));
//        parentAnimator.setEvaluator(new ArgbEvaluator());//设置估值器
            parentAnimator.setRepeatCount(ValueAnimator.INFINITE);//循环播放
//        parentAnimator.setRepeatMode(ValueAnimator.REVERSE);//动画从结尾开始播放
//        parentAnimator.setDuration(5000);
        parentAnimator.start();
    }
}
