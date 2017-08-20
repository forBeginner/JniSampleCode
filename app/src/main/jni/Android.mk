LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := NDKSampleModule
LOCAL_SRC_FILES := Native_NDKSample.cpp
LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)
