package com.example.oleg.calc.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.example.oleg.calc.Config;

/**
 * Created by Oleg on 04.10.2016.
 */

public class Result extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d(Config.TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Config.TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Config.TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Config.TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Config.TAG, "onDestroy");
    }
}
