package com.alimahdi.gradiantbackground;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();

        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);

        animationDrawable.start();

    }
}
