package com.rgz.adoptme.tween;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.rgz.adoptme.R;

public class TweenActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tween, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        ImageView imageView = (ImageView) findViewById(R.id.imageView1);
        Animation animation = null;
        switch (id) {
            case R.id.zoomInOut:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);
                imageView.startAnimation(animation);
                break;
            case R.id.rotate360:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
                imageView.startAnimation(animation);
                break;
            case R.id.fadeInOut:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                imageView.startAnimation(animation);
                break;

        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
