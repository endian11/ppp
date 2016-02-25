package com.example.john.mycoolweather;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    private RelativeLayout middle;
    private View child1;

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            addSecondUI();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        middle = (RelativeLayout)findViewById(R.id.ii_middle);
        init();
    }

    private void addSecondUI() {
        SecondUI secondUI = new SecondUI(this);

        View child2 = secondUI.getChild();
        middle.addView(child2);
//            FadeUtil.fadeIn(child2, 1000, 2000);
//             child.startAnimation(AnimationUtils.loadAnimation(this, R.anim.ia_view_change));
    }

    private void init() {

        addFirstUI();

    }

    private void addFirstUI() {
        FirstUI firstUI = new FirstUI(this);

        child1 = firstUI.getChild();
        middle.addView(child1);
        handler.sendEmptyMessageDelayed(10,2000);
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        addFirstUI();

    }
}
