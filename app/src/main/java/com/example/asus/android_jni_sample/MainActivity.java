package com.example.asus.android_jni_sample;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NDK_Sample ns_obj = new NDK_Sample();
        ns_obj.ndkSampleMethod("Android NDK Sample Code");

    }
}
