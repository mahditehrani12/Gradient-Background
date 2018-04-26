package com.alimahdi.gradiantbackground;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activityMain_relativeLayout_container);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();

        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);

        animationDrawable.start();

    }
}
