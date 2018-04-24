package com.example.mariajosemolina.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public class CustomAdapter extends PagerAdapter {
    public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
