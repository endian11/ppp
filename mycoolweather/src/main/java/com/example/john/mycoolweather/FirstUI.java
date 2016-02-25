package com.example.john.mycoolweather;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;

public class FirstUI extends BaseUI {



    public FirstUI(Context mContext) {
        super(mContext);
    }

    @Override
    public void setListener() {

    }

    @Override
    public void init() {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public View getChild() {
        TextView showInMiddle=new TextView(mContext);

        showInMiddle.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.MATCH_PARENT));
        showInMiddle.setBackgroundColor(Color.RED);
        showInMiddle.setText("这是第一个简答的界面");
        return showInMiddle;
    }
}
