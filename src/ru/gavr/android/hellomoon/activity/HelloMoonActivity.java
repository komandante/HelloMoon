package ru.gavr.android.hellomoon.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import ru.gavr.android.hellomoon.R;

public class HelloMoonActivity extends FragmentActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_moon);
    }
}
