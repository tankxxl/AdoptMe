package com.rgz.adoptme.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by rgz on 15/2/5.
 */
public class AnimButton  extends Button implements View.OnTouchListener {

    private static final String TAG = AnimButton.class.getSimpleName();
    private ObjectAnimator upAnim;
    private ObjectAnimator downAnim;

    public AnimButton(Context context) {
        super(context);
    }

    public AnimButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.i(TAG, event.getAction() + "");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (downAnim == null) {
                    downAnim = ObjectAnimator.ofFloat(this, "alpha", 1f, .3f)
                            .setDuration(1000);
                }
                downAnim.start();
                break;
            case MotionEvent.ACTION_UP:
                if (upAnim == null) {
                    upAnim = ObjectAnimator.ofFloat(this, "alpha", 1f, .3f)
                            .setDuration(1000);
                }
                upAnim.start();
                break;
            default:
                break;
        }
        return true;
    }
}
