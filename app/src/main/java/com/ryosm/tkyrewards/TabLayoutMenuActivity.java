package com.ryosm.tkyrewards;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ryosm.tkyrewards.adapter.MyPagerAdapter;

public class TabLayoutMenuActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ViewPager mViewPager;
    private MyPagerAdapter mAdapter;

    private TabLayout.OnTabSelectedListener mOnTabSelectedListener
            = new TabLayout.OnTabSelectedListener() {

        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            mViewPager.setCurrentItem(tab.getPosition());

            switch (tab.getPosition()) {
                case 0:
                    mTextMessage.setText(R.string.title_home);
                    return;
                case 1:
                    mTextMessage.setText(R.string.title_journeys);
                    return;
                case 2:
                    mTextMessage.setText(R.string.title_rewards);
                    return;
                case 3:
                    mTextMessage.setText(R.string.title_rewards_android);
                    return;
                case 4:
                    mTextMessage.setText(R.string.title_settings);
                    return;
            }
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_menu);

        mTextMessage = findViewById(R.id.message);
        TabLayout tabLayout = findViewById(R.id.navigation);
        mViewPager = findViewById(R.id.viewPager);

        mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.addOnTabSelectedListener(mOnTabSelectedListener);

        tabLayout.removeAllTabs();
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_home).setIcon(R.drawable.ic_home_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_journeys).setIcon(R.drawable.ic_dashboard_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_rewards).setIcon(R.drawable.ic_dashboard_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_rewards_android).setIcon(R.drawable.ic_dashboard_black_24dp));
//        tabLayout.addTab(tabLayout.newTab().setText(R.string.title_settings).setIcon(R.drawable.ic_notifications_black_24dp));

    }
}
