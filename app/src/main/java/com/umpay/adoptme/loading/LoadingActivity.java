package com.umpay.adoptme.loading;

import android.app.Activity;
import android.os.Bundle;

import com.umpay.adoptme.R;

/**
 * Created by rgz on 14-12-25.
 */
public class LoadingActivity extends Activity {

    CircleProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.loading_activity);

        progressBar = (CircleProgressBar) findViewById(R.id.circleProgressbar);

        new Thread() {
            @Override
            public void run() {
                int i = 0;
                while (i <=100) {
                    progressBar.setProgressNotInUiThread(i);
                    i++;
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
