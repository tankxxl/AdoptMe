package com.rgz.adoptme.propertyanim;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.rgz.adoptme.R;

public class PropertyAnimActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_anim);

        // wheel animation
        ImageView wheel = (ImageView) findViewById(R.id.wheel);
        // load the wheel animation
        AnimatorSet wheelSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.wheel_spin);
        // set the view as target
        wheelSet.setTarget(wheel);
        // start the animation
        wheelSet.start();


        // sun
        ImageView sun = (ImageView) findViewById(R.id.sun);
        AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.sun_swing);
        sunSet.setTarget(sun);
        sunSet.start();

        // sky
        ValueAnimator skyAnim = ObjectAnimator.ofInt(findViewById(R.id.car_layout),
                "backgroundColor", Color.rgb(0x66, 0xcc, 0xff), Color.rgb(0x00, 0x66, 0x99));
        skyAnim.setDuration(3000);
        skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        skyAnim.setRepeatMode(ValueAnimator.REVERSE);
        skyAnim.setEvaluator(new ArgbEvaluator());
        skyAnim.start();

        // cloud1
        ObjectAnimator cloudAnim = ObjectAnimator.ofFloat(findViewById(R.id.cloud1), "x", -350);
        cloudAnim.setDuration(3000);
        cloudAnim.setRepeatMode(ValueAnimator.REVERSE);
        cloudAnim.setRepeatCount(ValueAnimator.INFINITE);
        cloudAnim.start();

        // cloud2
        ObjectAnimator cloudAnim2 = ObjectAnimator.ofFloat(findViewById(R.id.cloud2), "x", -300);
        cloudAnim2.setDuration(3000);
        cloudAnim2.setRepeatCount(ValueAnimator.INFINITE);
        cloudAnim2.setRepeatMode(ValueAnimator.REVERSE);
        cloudAnim2.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_property_anim, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
