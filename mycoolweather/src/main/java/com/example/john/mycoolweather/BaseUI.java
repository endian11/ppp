package com.example.john.mycoolweather;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.Map;

/**
 * git  hub
 */
public abstract class BaseUI implements View.OnClickListener {
    protected Context mContext;
    protected Bundle mBundle;
    protected ViewGroup showInMiddle;

    protected Map<String,Object> data;

    public void setBundle(Bundle bundle){
        this.mBundle = bundle;
    }

    public BaseUI(Context mContext){
        this.mContext = mContext;
        init();
        setListener();
    }

    public abstract void setListener();

    public abstract void init();

    @Override
    public void onClick(View v) {

    }
    //jflajkl
    public View getChild(){

        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)showInMiddle.getLayoutParams();
        if (layoutParams == null){
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.MATCH_PARENT);
            showInMiddle.setLayoutParams(params);
        }
        return showInMiddle;
    }

    public void onPause(){}

    public void onResume(){}


    protected View findViewById(int id){
        return showInMiddle.findViewById(id);
    }


    public abstract int getId();
}
