package com.lenovo.slidingmenu;

import android.app.Activity;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends Activity {

    private SlidingMenu slidingMenul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slidingMenul = new SlidingMenu(this);
        slidingMenul.setMode(SlidingMenu.LEFT);
        slidingMenul.setBehindOffsetRes(R.dimen.slide_menu_width);
        slidingMenul.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenul.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        slidingMenul.setMenu(R.layout.slide_menu_layout);
    }
}
