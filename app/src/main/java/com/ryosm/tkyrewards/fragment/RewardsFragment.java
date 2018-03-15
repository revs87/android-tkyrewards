package com.ryosm.tkyrewards.fragment;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ryosm.tkyrewards.R;

/**
 * Created by rui.vieira on 15/03/2018.
 */

public class RewardsFragment extends Fragment {

    private static Fragment instance;

    public static Fragment getInstance() {
        if (instance == null) {
            instance = new RewardsFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_rewards_ios, container, false);


        FloatingActionButton fab = v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
            }
        });

        return v;
    }

}
