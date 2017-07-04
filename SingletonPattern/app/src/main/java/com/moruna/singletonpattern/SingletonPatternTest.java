package com.moruna.singletonpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SingletonPatternTest extends AppCompatActivity {
    private String TAG = "SingletonPatternTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_pattern_test);
        Log.d(TAG, Singleton.getInstance().getName());
        Log.d(TAG, Singleton.SingletonEnum.INSTANCE.getName());
    }
}
