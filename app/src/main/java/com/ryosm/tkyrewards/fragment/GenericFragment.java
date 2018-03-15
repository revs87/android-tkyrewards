package com.ryosm.tkyrewards.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ryosm.tkyrewards.R;

/**
 * Created by rui.vieira on 15/03/2018.
 */

public class GenericFragment extends Fragment {

    private static Fragment instance;

    public static Fragment getInstance() {
        return new GenericFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_generic, container, false);

        return v;
    }

}
