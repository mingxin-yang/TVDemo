package com.mx.tvdemo;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.umeng.analytics.MobclickAgent;

import reco.frame.tv.view.TvTabHost;

public class MainActivity extends FragmentActivity {

    private final String TAG="TvTabHostActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFrag();
    }


    @Override
    protected void onResume() {
        MobclickAgent.onResume(this);
        super.onResume();
    }
    @Override
    protected void onPause() {
        MobclickAgent.onPause(this);
        super.onPause();
    }

    private void loadFrag() {

        /**
         * 添加页面
         */
        TvTabHost tth_container = (TvTabHost) findViewById(R.id.tth_container);
        tth_container.addPage(getSupportFragmentManager(), new FragmentA(),
                "首页");
        tth_container.addPage(getSupportFragmentManager(), new FragmentB(),
                "中页");
        tth_container.addPage(getSupportFragmentManager(), new FragmentC(),
                "尾页");
        tth_container.buildLayout();

        /**
         * 设监听
         */
        tth_container.setOnPageChangeListener(new TvTabHost.ScrollPageChangerListener() {

            @Override
            public void onPageSelected(int pageCurrent) {

                Log.i(TAG, "第 "+(pageCurrent+1)+" 页");

            }
        });
        /**
         * 页面跳转
         */
        tth_container.setCurrentPage(0);
    }
}
