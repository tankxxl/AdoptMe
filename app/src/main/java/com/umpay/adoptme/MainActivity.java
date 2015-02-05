package com.umpay.adoptme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.umpay.adoptme.loading.LoadingActivity;
import com.umpay.adoptme.propertyanim.PropertyAnimActivity;
import com.umpay.adoptme.ripple.RipplesActivity;
import com.umpay.adoptme.tween.TweenActivity;

/**
 * Created by rgz on 14-12-25.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        findViewById(R.id.btn_adoptme).setOnClickListener(this);
        findViewById(R.id.btn_loading).setOnClickListener(this);
        findViewById(R.id.btn_ripple).setOnClickListener(this);
        findViewById(R.id.btn_propertyanim).setOnClickListener(this);
        findViewById(R.id.btn_tween).setOnClickListener(this);

        findViewById(R.id.btn_anim).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_adoptme:
                startActivity(new Intent(this, PetListActivity.class));
                break;
            case R.id.btn_loading:
                startActivity(new Intent(this, LoadingActivity.class));
                break;
            case R.id.btn_ripple:
                startActivity(new Intent(this, RipplesActivity.class));
                break;
            case R.id.btn_propertyanim:
                startActivity(new Intent(this, PropertyAnimActivity.class));
                break;
            case R.id.btn_tween:
                startActivity(new Intent(this, TweenActivity.class));
                break;

            case R.id.btn_anim:
                Toast.makeText(this, "btn_anim", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
