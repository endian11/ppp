package com.example.john.mycoolweather;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;

class SecondUI extends BaseUI {

    private TextView showInMiddle;

    public SecondUI(Context mContext) {
        super(mContext);
    }

    @Override
    public void setListener() {

    }

    @Override
    public void init() {
        showInMiddle = new TextView(mContext);

        showInMiddle.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.MATCH_PARENT));
        showInMiddle.setBackgroundColor(Color.BLUE);
        showInMiddle.setText("发");
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public View getChild() {
        return showInMiddle;
    }
}
