//
// Created by ASUS on 2017-08-19.
//

#include <stdio.h>
#include <Native_SharedHeader.h>
#include <com_example_asus_android_jni_sample_NDK_Sample.h>

JNIEXPORT void JNICALL Java_com_example_asus_android_1jni_1sample_NDK_1Sample_ndkSampleMethod(JNIEnv *, jobject, jstring)
{
    LOGD("NDK Branch - Test \n");
}
