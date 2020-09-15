#include "hello.h"
#include <string.h>

JNIEXPORT jstring JNICALL FUNC(getVersion)(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("1.0.0-reg18-ref65");
}
