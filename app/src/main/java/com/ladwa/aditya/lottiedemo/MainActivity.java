package com.ladwa.aditya.lottiedemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ladwa.aditya.lottiedemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private final String TOUCH_ID = "touch_id.json";
    private final String PROGRESS_BAR = "progress_bar.json";
    private final String FAV_ICON = "favourite_app_icon.json";
    private final String ATM_LINK = "atm_link.json";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                mBinding.animationView.setAnimation(TOUCH_ID);
                mBinding.animationView.playAnimation();
                break;
            case R.id.button2:
                mBinding.animationView.setAnimation(PROGRESS_BAR);
                mBinding.animationView.playAnimation();
                break;
            case R.id.button3:
                mBinding.animationView.setAnimation(FAV_ICON);
                mBinding.animationView.playAnimation();
                break;
            case R.id.button4:
                mBinding.animationView.setAnimation(ATM_LINK);
                mBinding.animationView.playAnimation();
                break;
        }
    }
}
