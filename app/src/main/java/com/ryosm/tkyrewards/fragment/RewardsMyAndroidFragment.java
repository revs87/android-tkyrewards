package com.ryosm.tkyrewards.fragment;


import android.graphics.Bitmap;
import android.graphics.Color;
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

public class RewardsMyAndroidFragment extends Fragment {

    private static Fragment instance;

    public static Fragment getInstance() {
        if (instance == null) {
            instance = new RewardsMyAndroidFragment();
        }
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_rewards_android_bottommy, container, false);

        FloatingActionButton fab = v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
            }
        });

        return v;
    }

    /**
     * Gray out imageview
     */
    // private ImageView instagramIcon;
    // instagramIcon =(ImageView)rootView.findViewById(R.id.instagram_image);
    // instagramIcon.setImageBitmap(grayScaleImage(BitmapFactory.decodeResource(getResources(),R.drawable.instagram_icon
    public static Bitmap grayOutImage(Bitmap src) {
        // constant factors
        final double G_RED = 0.299;
        final double G_GREEN = 0.587;
        final double G_BLUE = 0.114;
        // create output bitmap
        Bitmap bmOut = Bitmap.createBitmap(src.getWidth(), src.getHeight(), src.getConfig());
        // pixel information
        int A, R, G, B;
        int pixel;
        // get image size
        int width = src.getWidth();
        int height = src.getHeight();
        // scan through every single pixel
        for (int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                // get one pixel color
                pixel = src.getPixel(x, y);
                // retrieve color of all channels
                A = Color.alpha(pixel);
                R = Color.red(pixel);
                G = Color.green(pixel);
                B = Color.blue(pixel);
                // take conversion up to one single value
                R = G = B = (int) (G_RED * R + G_GREEN * G + G_BLUE * B);
                // set new pixel color to output bitmap
                bmOut.setPixel(x, y, Color.argb(A, R, G, B));
            }
        }
        // return final image
        return bmOut;
    }
}
