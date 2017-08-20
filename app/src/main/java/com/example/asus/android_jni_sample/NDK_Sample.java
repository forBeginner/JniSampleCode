package com.example.asus.android_jni_sample;

/**
 * Created by ASUS on 2017-08-19.
 */

public class NDK_Sample{

    static {
        System.loadLibrary("NDKSampleModule");
    }

    public native void ndkSampleMethod(String msg);

}
