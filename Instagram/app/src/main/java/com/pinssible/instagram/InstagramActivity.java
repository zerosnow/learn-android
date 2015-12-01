package com.pinssible.instagram;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class InstagramActivity extends AppCompatActivity {

    private InstagramFragment instagramFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        setSupportActionBar((Toolbar) findViewById(R.id.activity_main_toolbar));

        showInstagramFragment();
    }

    private void showInstagramFragment() {
        FragmentManager fragmentManage = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManage.beginTransaction();
        instagramFragment = new InstagramFragment();
        transaction.replace(R.id.instagram_main, instagramFragment);
        transaction.commitAllowingStateLoss();
    }



}
