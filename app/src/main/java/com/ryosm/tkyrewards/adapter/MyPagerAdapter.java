package com.ryosm.tkyrewards.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ryosm.tkyrewards.fragment.RewardsAndroidFragment;
import com.ryosm.tkyrewards.fragment.RewardsFragment;

/**
 * Created by rui.vieira on 15/03/2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    private final int NUM_TABS = 2;

    private int currentItem;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_TABS;
    }

    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                return RewardsFragment.getInstance();
            case 1:
                return RewardsAndroidFragment.getInstance();
        }
        return null;
    }

    public void setCurrentItem(int currentItem) {
        this.currentItem = currentItem;
    }

}