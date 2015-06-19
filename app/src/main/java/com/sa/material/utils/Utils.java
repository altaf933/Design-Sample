package com.sa.material.utils;

import android.content.Context;

import com.sa.material.R;


/**
 * Created by Suleiman on 15-06-2015.
 */
public class Utils {

    public static int getToolbarHeight(Context context) {
        int height = (int) context.getResources().getDimension(R.dimen.abc_action_bar_default_height_material);
        return height;
    }

    public static int getStatusBarHeight(Context context) {
        int height = (int) context.getResources().getDimension(R.dimen.statusbar_size);
        return height;
    }
}
