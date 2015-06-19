package com.sa.material.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sa.material.R;
import com.sa.material.fab.FloatingActionButton;

/**
 * Created by altafhussain.shaikh on 6/19/2015.
 */
public class FabActionAnim extends AppCompatActivity implements FloatingActionButton.OnCheckedChangeListener {
    private final static String TAG = "FabActionAnim";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fab_layout);

        FloatingActionButton fab1 = (FloatingActionButton)findViewById(R.id.fab_1);
        fab1.setOnCheckedChangeListener(this);
        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab_2);
        fab2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(FloatingActionButton fabView, boolean isChecked) {
        // When a FAB is toggled, log the action.
        switch (fabView.getId()){
            case R.id.fab_1:
                Log.d(TAG, String.format("FAB 1 was %s.", isChecked ? "checked" : "unchecked"));
                break;
            case R.id.fab_2:
                Log.d(TAG, String.format("FAB 2 was %s.", isChecked ? "checked" : "unchecked"));
                break;
            default:
                break;
        }
    }
}
