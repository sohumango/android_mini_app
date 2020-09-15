LOCAL_PATH := $(call my-dir)
# echo message.
# $(warning $(LOCAL_PATH))

include $(CLEAR_VARS)

LOCAL_MODULE := moduleA
LOCAL_SRC_FILES := hello.cpp

# LOCAL_CPPFLAGS :=
# LOCAL_LDFLAGS +=
# LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib

include $(BUILD_SHARED_LIBRARY)
