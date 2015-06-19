package com.sa.material.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sa.material.R;

/**
 * Created by altafhussain.shaikh on 6/15/2015.
 */
public abstract class BaseActivity extends AppCompatActivity {


    // Primary toolbar and drawer toggle
    private Toolbar mActionBarToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected Toolbar getActionbar() {
        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mActionBarToolbar != null) {
            setSupportActionBar(mActionBarToolbar);
        }
        return mActionBarToolbar;
    }

//    public abstract int setToolbarid(Toolbar toolbar);

    protected void setNavigationIcon(int iconRes) {
        mActionBarToolbar.setNavigationIcon(iconRes);
    }

}
