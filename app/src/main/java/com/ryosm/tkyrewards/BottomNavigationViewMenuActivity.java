package com.ryosm.tkyrewards;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.ryosm.tkyrewards.fragment.RewardsLiveAndroidFragment;
import com.ryosm.tkyrewards.fragment.RewardsMyAndroidFragment;

public class BottomNavigationViewMenuActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_rewards_my:
                    switchFragment(RewardsMyAndroidFragment.getInstance());
                    return true;
                case R.id.navigation_rewards_live:
                    switchFragment(RewardsLiveAndroidFragment.getInstance());
                    return true;
            }
            return false;
        }
    };

    private void switchFragment(Fragment instance) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, instance)
                .commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_menu);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        switchFragment(RewardsMyAndroidFragment.getInstance());


        TabLayout tabLayout = findViewById(R.id.navigation_tabs);
        tabLayout.addTab(tabLayout.newTab().setText("MAIN MENU").setIcon(R.drawable.ic_dashboard_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setText("MAIN MENU").setIcon(R.drawable.ic_dashboard_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setText("MAIN MENU").setIcon(R.drawable.ic_dashboard_black_24dp));
    }

}
